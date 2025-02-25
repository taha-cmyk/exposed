Syntax Rules
================

Overview
--------

The `SyntaxRules` class provides a set of functions and interfaces for syntax highlighting in a text editor. It defines a data class `SyntaxPattern` to represent a syntax pattern and its corresponding style. The `SyntaxHighlightingTheme` interface defines methods to get different text styles for keywords, strings, comments, numbers, and default text.

API Reference
-------------

### `SyntaxPattern(val regex: Regex, val style: TextStyle)`

**Description**: A data class to represent a syntax pattern and its corresponding style.

**Parameters**:
- `regex` (Regex): The regular expression to match the syntax pattern.
- `style` (TextStyle): The style to apply to the matched text.

**Returns**: An instance of `SyntaxPattern`.

**Example**:
```kotlin
val keywordPattern = SyntaxPattern(Regex("\\b(if|else|for|while)\\b"), TextStyle(fontSize = 16.sp, color = Color.Blue))
```

### `interface SyntaxHighlightingTheme`

**Description**: An interface to define methods to get different text styles for syntax highlighting.

**Methods**:
- `getKeywordStyle()`: Returns the text style for keywords.
- `getStringStyle()`: Returns the text style for strings.
- `getCommentStyle()`: Returns the text style for comments.
- `getNumbersStyle()`: Returns the text style for numbers.
- `getDefaultTextStyle()`: Returns the default text style.
- `getLanguageSpecificStyle(tokenType: String)`: Returns the text style for a language-specific token type.

**Example**:
```kotlin
class MySyntaxHighlightingTheme : SyntaxHighlightingTheme {
    override fun getKeywordStyle(): TextStyle {
        return TextStyle(fontSize = 16.sp, color = Color.Blue)
    }

    override fun getStringStyle(): TextStyle {
        return TextStyle(fontSize = 16.sp, color = Color.Green)
    }

    override fun getCommentStyle(): TextStyle {
        return TextStyle(fontSize = 16.sp, color = Color.Gray)
    }

    override fun getNumbersStyle(): TextStyle {
        return TextStyle(fontSize = 16.sp, color = Color.Red)
    }

    override fun getDefaultTextStyle(): TextStyle {
        return TextStyle(fontSize = 16.sp, color = Color.Black)
    }

    override fun getLanguageSpecificStyle(tokenType: String): TextStyle {
        return when (tokenType) {
            "function" -> TextStyle(fontSize = 16.sp, color = Color.Purple)
            else -> getDefaultTextStyle()
        }
    }
}
```

### `buildHighlightedCode(code: String, patterns: List<SyntaxPattern>)`

**Description**: Builds an annotated string with syntax highlighting based on the given code and patterns.

**Parameters**:
- `code` (String): The code to apply syntax highlighting to.
- `patterns` (List<SyntaxPattern>): A list of syntax patterns to apply.

**Returns**: An annotated string with syntax highlighting.

**Example**:
```kotlin
val code = "fun main() { println(\"Hello, World!\") }"
val patterns = listOf(
    SyntaxPattern(Regex("\\b(fun|main)\\b"), TextStyle(fontSize = 16.sp, color = Color.Blue)),
    SyntaxPattern(Regex("\"[^\"]*\""), TextStyle(fontSize = 16.sp, color = Color.Green))
)
val highlightedCode = buildHighlightedCode(code, patterns)
```

Usage Examples
-------------

### Syntax Highlighting Example

```kotlin
val code = "fun main() { println(\"Hello, World!\") }"
val patterns = listOf(
    SyntaxPattern(Regex("\\b(fun|main)\\b"), TextStyle(fontSize = 16.sp, color = Color.Blue)),
    SyntaxPattern(Regex("\"[^\"]*\""), TextStyle(fontSize = 16.sp, color = Color.Green))
)
val highlightedCode = buildHighlightedCode(code, patterns)
```

### Custom Syntax Highlighting Theme Example

```kotlin
class MySyntaxHighlightingTheme : SyntaxHighlightingTheme {
    override fun getKeywordStyle(): TextStyle {
        return TextStyle(fontSize = 16.sp, color = Color.Blue)
    }

    override fun getStringStyle(): TextStyle {
        return TextStyle(fontSize = 16.sp, color = Color.Green)
    }

    override fun getCommentStyle(): TextStyle {
        return TextStyle(fontSize = 16.sp, color = Color.Gray)
    }

    override fun getNumbersStyle(): TextStyle {
        return TextStyle(fontSize = 16.sp, color = Color.Red)
    }

    override fun getDefaultTextStyle(): TextStyle {
        return TextStyle(fontSize = 16.sp, color = Color.Black)
    }

    override fun getLanguageSpecificStyle(tokenType: String): TextStyle {
        return when (tokenType) {
            "function" -> TextStyle(fontSize = 16.sp, color = Color.Purple)
            else -> getDefaultTextStyle()
        }
    }
}
```