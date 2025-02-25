**Exposed Editor Documentation**
=====================================

**Overview**
------------

The Exposed Editor is a syntax-highlighted text editor for Android, built using Jetpack Compose. It currently supports the Ruby programming language and provides a customizable theme.

**Function Descriptions**
------------------------

### `SyntaxProvider.getSyntaxPatterns(language, theme)`

**Description**: Retrieves the syntax patterns for a given language and theme.

**Parameters**:

* `language` (Language): The programming language for which to retrieve syntax patterns.
* `theme` (Theme): The theme to apply to the syntax patterns.

**Returns**: A list of syntax patterns for the given language and theme.

**Throws**: None

**Example**:
```kotlin
val patterns = SyntaxProvider.getSyntaxPatterns(Language.RUBY, getRubyTheme(RubyThemes.DEFAULT))
```

### `getRubyTheme(theme)`

**Description**: Retrieves the Ruby theme corresponding to the given theme identifier.

**Parameters**:

* `theme` (RubyThemes): The identifier of the Ruby theme to retrieve.

**Returns**: The Ruby theme corresponding to the given identifier.

**Throws**: None

**Example**:
```kotlin
val rubyTheme = getRubyTheme(RubyThemes.DEFAULT)
```

### `SyntaxHighlightedTextField(code, patterns)`

**Description**: A Jetpack Compose UI component that displays syntax-highlighted text.

**Parameters**:

* `code` (String): The text to display with syntax highlighting.
* `patterns` (List<SyntaxPattern>): The syntax patterns to apply to the text.

**Returns**: None

**Throws**: None

**Example**:
```kotlin
SyntaxHighlightedTextField(
    code = """                                 
    """.trimIndent(),
    patterns = patterns
)
```

**Usage Examples**
-------------------

### Creating a Syntax-Highlighted Text Editor

To create a syntax-highlighted text editor, use the `SyntaxHighlightedTextField` component and pass in the code to display and the syntax patterns to apply:
```kotlin
val patterns = SyntaxProvider.getSyntaxPatterns(Language.RUBY, getRubyTheme(RubyThemes.DEFAULT))

SyntaxHighlightedTextField(
    code = """                                 
    """.trimIndent(),
    patterns = patterns
)
```

### Customizing the Theme

To customize the theme, use the `getRubyTheme` function to retrieve the desired theme and pass it to the `SyntaxProvider.getSyntaxPatterns` function:
```kotlin
val rubyTheme = getRubyTheme(RubyThemes.DARK)

val patterns = SyntaxProvider.getSyntaxPatterns(Language.RUBY, rubyTheme)

SyntaxHighlightedTextField(
    code = """                                 
    """.trimIndent(),
    patterns = patterns
)
```

**API Reference**
------------------

### `SyntaxProvider.getSyntaxPatterns(language, theme)`

* **Description**: Retrieves the syntax patterns for a given language and theme.
* **Parameters**:
	+ `language` (Language): The programming language for which to retrieve syntax patterns.
	+ `theme` (Theme): The theme to apply to the syntax patterns.
* **Returns**: A list of syntax patterns for the given language and theme.
* **Throws**: None
* **Example**:
```kotlin
val patterns = SyntaxProvider.getSyntaxPatterns(Language.RUBY, getRubyTheme(RubyThemes.DEFAULT))
```

### `getRubyTheme(theme)`

* **Description**: Retrieves the Ruby theme corresponding to the given theme identifier.
* **Parameters**:
	+ `theme` (RubyThemes): The identifier of the Ruby theme to retrieve.
* **Returns**: The Ruby theme corresponding to the given identifier.
* **Throws**: None
* **Example**:
```kotlin
val rubyTheme = getRubyTheme(RubyThemes.DEFAULT)
```

### `SyntaxHighlightedTextField(code, patterns)`

* **Description**: A Jetpack Compose UI component that displays syntax-highlighted text.
* **Parameters**:
	+ `code` (String): The text to display with syntax highlighting.
	+ `patterns` (List<SyntaxPattern>): The syntax patterns to apply to the text.
* **Returns**: None
* **Throws**: None
* **Example**:
```kotlin
SyntaxHighlightedTextField(
    code = """                                 
    """.trimIndent(),
    patterns = patterns
)
```

### `Language`

* **Description**: An enumeration of supported programming languages.
* **Values**:
	+ `RUBY`
* **Example**:
```kotlin
val language = Language.RUBY
```

### `RubyThemes`

* **Description**: An enumeration of available Ruby themes.
* **Values**:
	+ `DEFAULT`
	+ `DARK`
* **Example**:
```kotlin
val theme = RubyThemes.DEFAULT
```