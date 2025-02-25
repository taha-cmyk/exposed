# Exposed Editor Documentation

## Overview

The Exposed Editor is a simple code editor application that provides syntax highlighting for the Ruby programming language. It uses Jetpack Compose for building the user interface and a custom syntax highlighting mechanism.

## Class and Function Descriptions

### `MainActivity`

**Description**: The main activity of the application, responsible for setting up the content view and displaying the syntax highlighted code editor.

**Parameters**: None

**Returns**: None

**Example**:
```kotlin
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // ...
        }
    }
}
```

### `SyntaxProvider`

**Description**: A utility class that provides syntax patterns for a given programming language.

**Parameters**:

* `language` (Language): The programming language for which to retrieve the syntax patterns.
* `theme` (Theme): The theme to use for the syntax highlighting.

**Returns**: A list of syntax patterns for the given language and theme.

**Throws**: None

**Example**:
```kotlin
val patterns = SyntaxProvider.getSyntaxPatterns(Language.RUBY, getRubyTheme(RubyThemes.DEFAULT))
```

### `getRubySyntaxPatterns()`

**Description**: Retrieves the syntax patterns for the Ruby programming language.

**Parameters**: None

**Returns**: A list of syntax patterns for the Ruby language.

**Throws**: None

**Example**:
```kotlin
val patterns = getRubySyntaxPatterns()
```

### `getRubyTheme()`

**Description**: Retrieves the theme for the Ruby programming language.

**Parameters**:

* `theme` (RubyThemes): The theme to use for the Ruby language.

**Returns**: A theme for the Ruby language.

**Throws**: None

**Example**:
```kotlin
val theme = getRubyTheme(RubyThemes.DEFAULT)
```

### `SyntaxHighlightedTextField`

**Description**: A composable function that displays a text field with syntax highlighting.

**Parameters**:

* `code` (String): The code to display in the text field.
* `patterns` (List<SyntaxPattern>): The syntax patterns to use for highlighting.

**Returns**: A composable function that displays a text field with syntax highlighting.

**Throws**: None

**Example**:
```kotlin
SyntaxHighlightedTextField(
    code = """ 
    """.trimIndent(),
    patterns = patterns
)
```

### `PreviewHighlightedCodeEditor`

**Description**: A preview composable function that displays a syntax highlighted code editor.

**Parameters**: None

**Returns**: A composable function that displays a syntax highlighted code editor.

**Throws**: None

**Example**:
```kotlin
@Preview
@Composable
fun PreviewHighlightedCodeEditor() {
    // ...
}
```

## API Reference

### `MainActivity()`

**Description**: The main activity of the application, responsible for setting up the content view and displaying the syntax highlighted code editor.

**Parameters**: None

**Returns**: None

**Throws**: None

**Example**:
```kotlin
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // ...
        }
    }
}
```

### `SyntaxProvider.getSyntaxPatterns(language, theme)`

**Description**: Retrieves the syntax patterns for a given programming language and theme.

**Parameters**:

* `language` (Language): The programming language for which to retrieve the syntax patterns.
* `theme` (Theme): The theme to use for the syntax highlighting.

**Returns**: A list of syntax patterns for the given language and theme.

**Throws**: None

**Example**:
```kotlin
val patterns = SyntaxProvider.getSyntaxPatterns(Language.RUBY, getRubyTheme(RubyThemes.DEFAULT))
```

### `getRubySyntaxPatterns()`

**Description**: Retrieves the syntax patterns for the Ruby programming language.

**Parameters**: None

**Returns**: A list of syntax patterns for the Ruby language.

**Throws**: None

**Example**:
```kotlin
val patterns = getRubySyntaxPatterns()
```

### `getRubyTheme(theme)`

**Description**: Retrieves the theme for the Ruby programming language.

**Parameters**:

* `theme` (RubyThemes): The theme to use for the Ruby language.

**Returns**: A theme for the Ruby language.

**Throws**: None

**Example**:
```kotlin
val theme = getRubyTheme(RubyThemes.DEFAULT)
```

### `SyntaxHighlightedTextField(code, patterns)`

**Description**: A composable function that displays a text field with syntax highlighting.

**Parameters**:

* `code` (String): The code to display in the text field.
* `patterns` (List<SyntaxPattern>): The syntax patterns to use for highlighting.

**Returns**: A composable function that displays a text field with syntax highlighting.

**Throws**: None

**Example**:
```kotlin
SyntaxHighlightedTextField(
    code = """ 
    """.trimIndent(),
    patterns = patterns
)
```

### `PreviewHighlightedCodeEditor()`

**Description**: A preview composable function that displays a syntax highlighted code editor.

**Parameters**: None

**Returns**: A composable function that displays a syntax highlighted code editor.

**Throws**: None

**Example**:
```kotlin
@Preview
@Composable
fun PreviewHighlightedCodeEditor() {
    // ...
}
```