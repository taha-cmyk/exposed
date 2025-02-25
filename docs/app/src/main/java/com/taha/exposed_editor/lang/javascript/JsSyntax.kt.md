**JavaScript Syntax Highlighting**
=====================================

Overview
--------

This module provides syntax highlighting for JavaScript code. It defines a set of syntax patterns and a default theme for highlighting JavaScript syntax.

### `getJavaScriptSyntaxPatterns(theme)`

**Description**: Returns a list of syntax patterns for JavaScript.

**Parameters**:

* `theme` (SyntaxHighlightingTheme): The theme to use for syntax highlighting.

**Returns**: A list of SyntaxPattern objects.

**Example**:
```kotlin
val theme = JavaScriptDefaultTheme()
val syntaxPatterns = getJavaScriptSyntaxPatterns(theme)
```

### `JavaScriptDefaultTheme`

**Description**: A default theme for JavaScript syntax highlighting.

**Properties**:

* `keywordStyle`: The style for keywords.
* `stringStyle`: The style for strings.
* `commentStyle`: The style for comments.
* `numbersStyle`: The style for numbers.
* `defaultTextStyle`: The default text style.
* `languageSpecificStyles`: A map of language-specific styles.

**Methods**:

* `getKeywordStyle()`: Returns the style for keywords.
* `getStringStyle()`: Returns the style for strings.
* `getCommentStyle()`: Returns the style for comments.
* `getNumbersStyle()`: Returns the style for numbers.
* `getDefaultTextStyle()`: Returns the default text style.
* `getLanguageSpecificStyle(tokenType)`: Returns the language-specific style for the given token type.

**Example**:
```kotlin
val theme = JavaScriptDefaultTheme()
val keywordStyle = theme.getKeywordStyle()
```

API Reference
-------------

### `getJavaScriptSyntaxPatterns(theme)`

**Description**: Returns a list of syntax patterns for JavaScript.

**Parameters**:

* `theme` (SyntaxHighlightingTheme): The theme to use for syntax highlighting.

**Returns**: A list of SyntaxPattern objects.

**Throws**: None.

**Example**:
```kotlin
val theme = JavaScriptDefaultTheme()
val syntaxPatterns = getJavaScriptSyntaxPatterns(theme)
```

### `JavaScriptDefaultTheme.getKeywordStyle()`

**Description**: Returns the style for keywords.

**Parameters**: None.

**Returns**: A TextStyle object.

**Throws**: None.

**Example**:
```kotlin
val theme = JavaScriptDefaultTheme()
val keywordStyle = theme.getKeywordStyle()
```

### `JavaScriptDefaultTheme.getStringStyle()`

**Description**: Returns the style for strings.

**Parameters**: None.

**Returns**: A TextStyle object.

**Throws**: None.

**Example**:
```kotlin
val theme = JavaScriptDefaultTheme()
val stringStyle = theme.getStringStyle()
```

### `JavaScriptDefaultTheme.getCommentStyle()`

**Description**: Returns the style for comments.

**Parameters**: None.

**Returns**: A TextStyle object.

**Throws**: None.

**Example**:
```kotlin
val theme = JavaScriptDefaultTheme()
val commentStyle = theme.getCommentStyle()
```

### `JavaScriptDefaultTheme.getNumbersStyle()`

**Description**: Returns the style for numbers.

**Parameters**: None.

**Returns**: A TextStyle object.

**Throws**: None.

**Example**:
```kotlin
val theme = JavaScriptDefaultTheme()
val numbersStyle = theme.getNumbersStyle()
```

### `JavaScriptDefaultTheme.getDefaultTextStyle()`

**Description**: Returns the default text style.

**Parameters**: None.

**Returns**: A TextStyle object.

**Throws**: None.

**Example**:
```kotlin
val theme = JavaScriptDefaultTheme()
val defaultTextStyle = theme.getDefaultTextStyle()
```

### `JavaScriptDefaultTheme.getLanguageSpecificStyle(tokenType)`

**Description**: Returns the language-specific style for the given token type.

**Parameters**:

* `tokenType` (String): The token type.

**Returns**: A TextStyle object.

**Throws**: None.

**Example**:
```kotlin
val theme = JavaScriptDefaultTheme()
val style = theme.getLanguageSpecificStyle("javascript_function")
```