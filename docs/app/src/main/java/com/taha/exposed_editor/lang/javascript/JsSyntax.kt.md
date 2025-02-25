JavaScript Syntax Highlighting
=============================

Overview
--------

This module provides syntax highlighting for JavaScript. It defines a set of patterns to match different syntax elements, such as keywords, strings, comments, and more. The highlighting is customizable through a theme, which defines the colors and styles for each syntax element.

API Reference
-------------

### `getJavaScriptSyntaxPatterns(theme: SyntaxHighlightingTheme)`

**Description**: Returns a list of syntax patterns for JavaScript, given a theme.

**Parameters**:
- `theme` (SyntaxHighlightingTheme): The theme to use for highlighting.

**Returns**: A list of syntax patterns.

**Example**:
```kotlin
val theme = JavaScriptDefaultTheme()
val patterns = getJavaScriptSyntaxPatterns(theme)
```

### `JavaScriptDefaultTheme`

**Description**: A default theme for JavaScript syntax highlighting.

**Properties**:
- `keywordStyle` (TextStyle): The style for keywords.
- `stringStyle` (TextStyle): The style for strings.
- `commentStyle` (TextStyle): The style for comments.
- `numbersStyle` (TextStyle): The style for numbers.
- `defaultTextStyle` (TextStyle): The default text style.

**Methods**:
- `getKeywordStyle()`: Returns the style for keywords.
- `getStringStyle()`: Returns the style for strings.
- `getCommentStyle()`: Returns the style for comments.
- `getNumbersStyle()`: Returns the style for numbers.
- `getDefaultTextStyle()`: Returns the default text style.
- `getLanguageSpecificStyle(tokenType: String)`: Returns the style for a specific syntax element.

**Example**:
```kotlin
val theme = JavaScriptDefaultTheme()
val keywordStyle = theme.getKeywordStyle()
```

### `getLanguageSpecificStyle(tokenType: String)`

**Description**: Returns the style for a specific syntax element, given a token type.

**Parameters**:
- `tokenType` (String): The token type to get the style for.

**Returns**: The style for the given token type.

**Example**:
```kotlin
val theme = JavaScriptDefaultTheme()
val style = theme.getLanguageSpecificStyle("javascript_class")
```

Usage Examples
-------------

### Basic Usage

```kotlin
val theme = JavaScriptDefaultTheme()
val patterns = getJavaScriptSyntaxPatterns(theme)
```

### Custom Theme

```kotlin
class CustomTheme : SyntaxHighlightingTheme {
    override fun getKeywordStyle() = TextStyle(color = Color(0xFF0000FF)) // Blue
    override fun getStringStyle() = TextStyle(color = Color(0xFF00FF00)) // Green
    override fun getCommentStyle() = TextStyle(color = Color(0xFF808080)) // Gray
    override fun getNumbersStyle(): TextStyle = TextStyle(color = Color(0xFFFFFF00)) // Yellow
    override fun getDefaultTextStyle(): TextStyle = TextStyle(color = Color(0xFFA9B7C6)) // Light gray

    private val languageSpecificStyles: Map<String, TextStyle> = mapOf(
        "javascript_class" to TextStyle(color = Color(0xFFA9B7C6), fontWeight = FontWeight.Bold), // Light gray
        "javascript_function" to TextStyle(color = Color(0xFFFFC66D)), // Yellow
        "javascript_arrow_function" to TextStyle(color = Color(0xFFFFC66D)), // Yellow
        "javascript_variable" to TextStyle(color = Color(0xFFA9B7C6)), // Light gray
        "javascript_constant" to TextStyle(color = Color(0xFF9876AA)), // Purple
        "javascript_operator" to TextStyle(color = Color(0xFFA9B7C6)), // Light gray
        "javascript_bracket" to TextStyle(color = Color(0xFFA9B7C6)), // Light gray
        "javascript_parenthesis" to TextStyle(color = Color(0xFFA9B7C6)), // Light gray
        "javascript_brace" to TextStyle(color = Color(0xFFA9B7C6)), // Light gray
        "javascript_parameter" to TextStyle(color = Color(0xFFA9B7C6)), // Light gray
        "javascript_property" to TextStyle(color = Color(0xFF9876AA)), // Purple
        "javascript_template_placeholder" to TextStyle(color = Color(0xFF6897BB)) // Blue
    )

    override fun getLanguageSpecificStyle(tokenType: String): TextStyle {
        return languageSpecificStyles[tokenType] ?: TextStyle(color = Color(0xFFA9B7C6)) // Fallback to light gray
    }
}

val theme = CustomTheme()
val patterns = getJavaScriptSyntaxPatterns(theme)
```