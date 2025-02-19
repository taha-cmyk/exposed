**Syntax Highlighting Library**
==========================

Overview
--------

This library provides a simple way to apply syntax highlighting to code strings in Android applications using Jetpack Compose. It uses a list of predefined patterns to match specific parts of the code, such as keywords, strings, comments, and numbers, and applies different text styles to each match.

### SyntaxHighlightingTheme Interface

The `SyntaxHighlightingTheme` interface defines a set of methods that must be implemented to provide a custom syntax highlighting theme. These methods return the text styles for different parts of the code.

#### Methods

* `getKeywordStyle()`: Returns the text style for keywords.
* `getStringStyle()`: Returns the text style for strings.
* `getCommentStyle()`: Returns the text style for comments.
* `getNumbersStyle()`: Returns the text style for numbers.
* `getDefaultTextStyle()`: Returns the default text style for plain text.
* `getLanguageSpecificStyle(tokenType: String)`: Returns the text style for language-specific tokens.

### SyntaxPattern Data Class

The `SyntaxPattern` data class represents a single pattern to match in the code. It has two properties:

* `regex`: A regular expression to match the pattern.
* `style`: The text style to apply to the matched pattern.

### buildHighlightedCode Function

The `buildHighlightedCode` function takes a code string and a list of `SyntaxPattern` objects, and returns an `AnnotatedString` with the syntax highlighting applied.

#### Parameters

* `code`: The code string to apply syntax highlighting to.
* `patterns`: A list of `SyntaxPattern` objects to match in the code.

#### Return Value

An `AnnotatedString` with the syntax highlighting applied.

#### Usage Example

```kotlin
val theme = object : SyntaxHighlightingTheme {
    override fun getKeywordStyle(): TextStyle {
        return TextStyle(color = Color.Blue)
    }

    override fun getStringStyle(): TextStyle {
        return TextStyle(color = Color.Green)
    }

    override fun getCommentStyle(): TextStyle {
        return TextStyle(color = Color.Gray)
    }

    override fun getNumbersStyle(): TextStyle {
        return TextStyle(color = Color.Red)
    }

    override fun getDefaultTextStyle(): TextStyle {
        return TextStyle(color = Color.Black)
    }

    override fun getLanguageSpecificStyle(tokenType: String): TextStyle {
        // Implement language-specific styles here
        return TextStyle(color = Color.Black)
    }
}

val patterns = listOf(
    SyntaxPattern(Regex("\\b(if|else|for|while)\\b"), theme.getKeywordStyle()),
    SyntaxPattern(Regex("\"[^\"]*\""), theme.getStringStyle()),
    SyntaxPattern(Regex("//.*"), theme.getCommentStyle()),
    SyntaxPattern(Regex("\\b\\d+\\b"), theme.getNumbersStyle())
)

val code = "if (true) { println(\"Hello, World!\") } // Comment"
val highlightedCode = buildHighlightedCode(code, patterns)
```

In this example, we define a custom `SyntaxHighlightingTheme` and a list of `SyntaxPattern` objects to match keywords, strings, comments, and numbers. We then pass the code string and the list of patterns to the `buildHighlightedCode` function to get the syntax highlighted `AnnotatedString`.