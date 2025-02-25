# Syntax Highlighting API
=========================

## Overview

The Syntax Highlighting API is a Kotlin library that provides a simple way to highlight code syntax in a text editor. It allows you to define syntax patterns and apply them to a code string, resulting in an annotated string with highlighted syntax.

## Class and Function Descriptions

### `SyntaxPattern(regex, style)`

**Description**: A data class that represents a syntax pattern, consisting of a regular expression and a text style.

**Parameters**:
- `regex` (Regex): The regular expression that matches the syntax pattern.
- `style` (TextStyle): The text style to apply to the matched syntax pattern.

**Returns**: A new `SyntaxPattern` instance.

**Example**:
```kotlin
val keywordPattern = SyntaxPattern(Regex("\\b(if|else|for|while)\\b"), TextStyle(color = Color.Blue))
```

### `SyntaxHighlightingTheme`

**Description**: An interface that defines a syntax highlighting theme. Implementations of this interface should provide text styles for keywords, strings, comments, numbers, and default text.

**Methods**:

#### `getKeywordStyle()`

**Description**: Returns the text style for keywords.

**Returns**: A `TextStyle` instance.

#### `getStringStyle()`

**Description**: Returns the text style for strings.

**Returns**: A `TextStyle` instance.

#### `getCommentStyle()`

**Description**: Returns the text style for comments.

**Returns**: A `TextStyle` instance.

#### `getNumbersStyle()`

**Description**: Returns the text style for numbers.

**Returns**: A `TextStyle` instance.

#### `getDefaultTextStyle()`

**Description**: Returns the default text style.

**Returns**: A `TextStyle` instance.

#### `getLanguageSpecificStyle(tokenType)`

**Description**: Returns a language-specific text style for the given token type.

**Parameters**:
- `tokenType` (String): The token type.

**Returns**: A `TextStyle` instance.

### `buildHighlightedCode(code, patterns)`

**Description**: Builds an annotated string with highlighted syntax from the given code and syntax patterns.

**Parameters**:
- `code` (String): The code string to highlight.
- `patterns` (List<SyntaxPattern>): The list of syntax patterns to apply.

**Returns**: An `AnnotatedString` instance with highlighted syntax.

**Example**:
```kotlin
val code = "fun main() { println(\"Hello, World!\") }"
val patterns = listOf(
    SyntaxPattern(Regex("\\b(fun|main)\\b"), TextStyle(color = Color.Blue)),
    SyntaxPattern(Regex("\"[^\"]*\""), TextStyle(color = Color.Green))
)
val highlightedCode = buildHighlightedCode(code, patterns)
```

## API Reference

### `SyntaxPattern(regex, style)`

**Description**: A data class that represents a syntax pattern, consisting of a regular expression and a text style.

**Parameters**:
- `regex` (Regex): The regular expression that matches the syntax pattern.
- `style` (TextStyle): The text style to apply to the matched syntax pattern.

**Returns**: A new `SyntaxPattern` instance.

**Throws**: None

**Example**:
```kotlin
val keywordPattern = SyntaxPattern(Regex("\\b(if|else|for|while)\\b"), TextStyle(color = Color.Blue))
```

### `SyntaxHighlightingTheme`

**Description**: An interface that defines a syntax highlighting theme.

**Methods**:

#### `getKeywordStyle()`

**Description**: Returns the text style for keywords.

**Parameters**: None

**Returns**: A `TextStyle` instance.

**Throws**: None

#### `getStringStyle()`

**Description**: Returns the text style for strings.

**Parameters**: None

**Returns**: A `TextStyle` instance.

**Throws**: None

#### `getCommentStyle()`

**Description**: Returns the text style for comments.

**Parameters**: None

**Returns**: A `TextStyle` instance.

**Throws**: None

#### `getNumbersStyle()`

**Description**: Returns the text style for numbers.

**Parameters**: None

**Returns**: A `TextStyle` instance.

**Throws**: None

#### `getDefaultTextStyle()`

**Description**: Returns the default text style.

**Parameters**: None

**Returns**: A `TextStyle` instance.

**Throws**: None

#### `getLanguageSpecificStyle(tokenType)`

**Description**: Returns a language-specific text style for the given token type.

**Parameters**:
- `tokenType` (String): The token type.

**Returns**: A `TextStyle` instance.

**Throws**: None

### `buildHighlightedCode(code, patterns)`

**Description**: Builds an annotated string with highlighted syntax from the given code and syntax patterns.

**Parameters**:
- `code` (String): The code string to highlight.
- `patterns` (List<SyntaxPattern>): The list of syntax patterns to apply.

**Returns**: An `AnnotatedString` instance with highlighted syntax.

**Throws**: None

**Example**:
```kotlin
val code = "fun main() { println(\"Hello, World!\") }"
val patterns = listOf(
    SyntaxPattern(Regex("\\b(fun|main)\\b"), TextStyle(color = Color.Blue)),
    SyntaxPattern(Regex("\"[^\"]*\""), TextStyle(color = Color.Green))
)
val highlightedCode = buildHighlightedCode(code, patterns)
```