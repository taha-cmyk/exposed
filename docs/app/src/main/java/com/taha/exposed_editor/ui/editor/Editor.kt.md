**Syntax Highlighted Text Field Documentation**
=====================================================

Overview
--------

The `SyntaxHighlightedTextField` is a Composable function in Jetpack Compose that provides a text field with real-time syntax highlighting. It is designed to display and edit code in a variety of programming languages.

Function Description
--------------------

### `SyntaxHighlightedTextField`

This Composable function creates a text field that highlights syntax based on the provided patterns.

#### Parameters

*   `code`: The initial code to be displayed in the text field. Defaults to an empty string.
*   `patterns`: A list of `SyntaxPattern` objects that define the syntax highlighting rules.
*   `backgroundColor`: The background color of the text field. Defaults to white.
*   `foregroundColor`: The foreground color of the text field. Defaults to black.

#### Return Value

This function does not return any value. It is a Composable function that renders a UI component.

Usage Examples
--------------

### Basic Usage

```kotlin
@Composable
fun CodeEditor() {
    SyntaxHighlightedTextField(
        code = "fun main() { println(\"Hello, World!\") }",
        patterns = listOf(
            SyntaxPattern("fun", Color.Blue),
            SyntaxPattern("println", Color.Blue),
            SyntaxPattern("\\(\".*\"\\)", Color.Green)
        ),
        backgroundColor = Color.DarkGray,
        foregroundColor = Color.White
    )
}
```

### Customizing the Appearance

You can customize the appearance of the text field by providing custom background and foreground colors.

```kotlin
@Composable
fun CodeEditor() {
    SyntaxHighlightedTextField(
        code = "fun main() { println(\"Hello, World!\") }",
        patterns = listOf(
            SyntaxPattern("fun", Color.Blue),
            SyntaxPattern("println", Color.Blue),
            SyntaxPattern("\\(\".*\"\\)", Color.Green)
        ),
        backgroundColor = Color.DarkGray,
        foregroundColor = Color.Cyan
    )
}
```

### Using System Theme

You can use the system theme to automatically switch between light and dark modes.

```kotlin
@Composable
fun CodeEditor() {
    val isSystemInDarkTheme = isSystemInDarkTheme()
    val backgroundColor = if (isSystemInDarkTheme) Color.DarkGray else Color.White
    val foregroundColor = if (isSystemInDarkTheme) Color.White else Color.Black

    SyntaxHighlightedTextField(
        code = "fun main() { println(\"Hello, World!\") }",
        patterns = listOf(
            SyntaxPattern("fun", Color.Blue),
            SyntaxPattern("println", Color.Blue),
            SyntaxPattern("\\(\".*\"\\)", Color.Green)
        ),
        backgroundColor = backgroundColor,
        foregroundColor = foregroundColor
    )
}
```

API Documentation
-----------------

### `SyntaxHighlightedTextField`

```kotlin
@Composable
fun SyntaxHighlightedTextField(
    code: String = "",
    patterns: List<SyntaxPattern>,
    backgroundColor: Color = Color.White,
    foregroundColor: Color = Color.Black
)
```

*   `code`: The initial code to be displayed in the text field.
*   `patterns`: A list of `SyntaxPattern` objects that define the syntax highlighting rules.
*   `backgroundColor`: The background color of the text field.
*   `foregroundColor`: The foreground color of the text field.