# Syntax Highlighted Text Field
================================

The `SyntaxHighlightedTextField` is a composable function in Jetpack Compose that provides a text field with real-time syntax highlighting. It is designed to be used in code editors or other applications where syntax highlighting is desired.

## Function Description
------------------------

### `SyntaxHighlightedTextField(code, patterns, backgroundColor, foregroundColor)`

**Description**: A composable function that creates a text field with real-time syntax highlighting.

**Parameters**:

* `code` (String): The initial code to be displayed in the text field. Defaults to an empty string.
* `patterns` (List<SyntaxPattern>): A list of syntax patterns to be used for highlighting.
* `backgroundColor` (Color): The background color of the text field. Defaults to white.
* `foregroundColor` (Color): The foreground color of the text field. Defaults to black.

**Returns**: A composable function that renders a text field with syntax highlighting.

**Throws**: None

**Example**:
```kotlin
@Composable
fun MyCodeEditor() {
    val patterns = listOf(
        SyntaxPattern("keyword", "\\b(if|else|for|while)\\b".toRegex(), Color.Blue),
        SyntaxPattern("string", "\".*\"".toRegex(), Color.Green)
    )
    
    SyntaxHighlightedTextField(code = "if (true) { println(\"Hello World\") }", patterns = patterns)
}
```

## API Reference
-----------------

### `SyntaxHighlightedTextField(code, patterns, backgroundColor, foregroundColor)`

**Description**: A composable function that creates a text field with real-time syntax highlighting.

**Parameters**:

* `code` (String): The initial code to be displayed in the text field. Defaults to an empty string.
* `patterns` (List<SyntaxPattern>): A list of syntax patterns to be used for highlighting.
* `backgroundColor` (Color): The background color of the text field. Defaults to white.
* `foregroundColor` (Color): The foreground color of the text field. Defaults to black.

**Returns**: A composable function that renders a text field with syntax highlighting.

**Throws**: None

**Example**:
```kotlin
@Composable
fun MyCodeEditor() {
    val patterns = listOf(
        SyntaxPattern("keyword", "\\b(if|else|for|while)\\b".toRegex(), Color.Blue),
        SyntaxPattern("string", "\".*\"".toRegex(), Color.Green)
    )
    
    SyntaxHighlightedTextField(code = "if (true) { println(\"Hello World\") }", patterns = patterns)
}
```

## Usage Examples
-----------------

### Basic Usage

```kotlin
@Composable
fun MyCodeEditor() {
    val patterns = listOf(
        SyntaxPattern("keyword", "\\b(if|else|for|while)\\b".toRegex(), Color.Blue),
        SyntaxPattern("string", "\".*\"".toRegex(), Color.Green)
    )
    
    SyntaxHighlightedTextField(code = "if (true) { println(\"Hello World\") }", patterns = patterns)
}
```

### Custom Background and Foreground Colors

```kotlin
@Composable
fun MyCodeEditor() {
    val patterns = listOf(
        SyntaxPattern("keyword", "\\b(if|else|for|while)\\b".toRegex(), Color.Blue),
        SyntaxPattern("string", "\".*\"".toRegex(), Color.Green)
    )
    
    SyntaxHighlightedTextField(
        code = "if (true) { println(\"Hello World\") }",
        patterns = patterns,
        backgroundColor = Color.DarkGray,
        foregroundColor = Color.White
    )
}
```

Note: The `SyntaxPattern` class is not included in this documentation as it is assumed to be a separate entity that defines a syntax pattern for highlighting.