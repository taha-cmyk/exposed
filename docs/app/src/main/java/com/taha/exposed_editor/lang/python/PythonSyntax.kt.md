**Python Syntax Highlighting Documentation**
=============================================

**Overview**
------------

This documentation provides an overview of the Python syntax highlighting code, including function descriptions, parameters, return values, usage examples, and API references.

**Function Descriptions**
------------------------

### `getPythonSyntaxPatterns(theme: SyntaxHighlightingTheme)`

**Description**: Returns a list of syntax patterns for Python syntax highlighting.

**Parameters**:

* `theme` (SyntaxHighlightingTheme): The theme to use for syntax highlighting.

**Returns**: A list of SyntaxPattern objects.

**Throws**: None.

**Example**:
```kotlin
val theme = PythonDefaultTheme()
val patterns = getPythonSyntaxPatterns(theme)
```

### `PythonDefaultTheme` Class

**Description**: A default theme for Python syntax highlighting.

**Properties**:

* `keywordStyle` (TextStyle): The style for keywords.
* `stringStyle` (TextStyle): The style for strings.
* `commentStyle` (TextStyle): The style for comments.
* `numbersStyle` (TextStyle): The style for numbers.
* `defaultTextStyle` (TextStyle): The default text style.
* `languageSpecificStyles` (Map<String, TextStyle>): A map of language-specific styles.

**Methods**:

* `getKeywordStyle()` (TextStyle): Returns the style for keywords.
* `getStringStyle()` (TextStyle): Returns the style for strings.
* `getCommentStyle()` (TextStyle): Returns the style for comments.
* `getNumbersStyle()` (TextStyle): Returns the style for numbers.
* `getDefaultTextStyle()` (TextStyle): Returns the default text style.
* `getLanguageSpecificStyle(tokenType: String)` (TextStyle): Returns the language-specific style for the given token type.

**API Reference**
-----------------

### `getPythonSyntaxPatterns(theme: SyntaxHighlightingTheme)`

**Description**: Returns a list of syntax patterns for Python syntax highlighting.

**Parameters**:

* `theme` (SyntaxHighlightingTheme): The theme to use for syntax highlighting.

**Returns**: A list of SyntaxPattern objects.

**Throws**: None.

**Example**:
```kotlin
val theme = PythonDefaultTheme()
val patterns = getPythonSyntaxPatterns(theme)
```

### `PythonDefaultTheme` Class

#### `getKeywordStyle()`

**Description**: Returns the style for keywords.

**Parameters**: None.

**Returns**: A TextStyle object.

**Throws**: None.

**Example**:
```kotlin
val theme = PythonDefaultTheme()
val keywordStyle = theme.getKeywordStyle()
```

#### `getStringStyle()`

**Description**: Returns the style for strings.

**Parameters**: None.

**Returns**: A TextStyle object.

**Throws**: None.

**Example**:
```kotlin
val theme = PythonDefaultTheme()
val stringStyle = theme.getStringStyle()
```

#### `getCommentStyle()`

**Description**: Returns the style for comments.

**Parameters**: None.

**Returns**: A TextStyle object.

**Throws**: None.

**Example**:
```kotlin
val theme = PythonDefaultTheme()
val commentStyle = theme.getCommentStyle()
```

#### `getNumbersStyle()`

**Description**: Returns the style for numbers.

**Parameters**: None.

**Returns**: A TextStyle object.

**Throws**: None.

**Example**:
```kotlin
val theme = PythonDefaultTheme()
val numbersStyle = theme.getNumbersStyle()
```

#### `getDefaultTextStyle()`

**Description**: Returns the default text style.

**Parameters**: None.

**Returns**: A TextStyle object.

**Throws**: None.

**Example**:
```kotlin
val theme = PythonDefaultTheme()
val defaultTextStyle = theme.getDefaultTextStyle()
```

#### `getLanguageSpecificStyle(tokenType: String)`

**Description**: Returns the language-specific style for the given token type.

**Parameters**:

* `tokenType` (String): The token type.

**Returns**: A TextStyle object.

**Throws**: None.

**Example**:
```kotlin
val theme = PythonDefaultTheme()
val style = theme.getLanguageSpecificStyle("python_class")
```

### `SyntaxPattern` Class

**Description**: A class representing a syntax pattern.

**Properties**:

* `regex` (Regex): The regular expression for the pattern.
* `style` (TextStyle): The style for the pattern.

**Methods**:

* `SyntaxPattern(regex: Regex, style: TextStyle)` (Constructor): Creates a new SyntaxPattern object.

**Example**:
```kotlin
val pattern = SyntaxPattern(Regex("\\b(and|as|assert|async|await|break|class|continue|def|del|elif|else|except|finally|for|from|global|if|import|in|is|lambda|nonlocal|not|or|pass|raise|return|try|while|with|yield|True|False|None)\\b"), theme.getKeywordStyle())
```