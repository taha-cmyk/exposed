Python Syntax Highlighting
==========================

Overview
--------

This code provides a set of functions and classes for syntax highlighting in Python programming language. It includes a `getPythonSyntaxPatterns` function that returns a list of syntax patterns for highlighting different elements of Python code, such as keywords, strings, comments, numbers, and more. Additionally, it includes a `PythonDefaultTheme` class that defines the default styles for each syntax pattern.

Function Descriptions
--------------------

### getPythonSyntaxPatterns

*   Returns a list of `SyntaxPattern` objects that define the syntax patterns for highlighting Python code.
*   Takes a `SyntaxHighlightingTheme` object as a parameter, which provides the styles for each syntax pattern.

### PythonDefaultTheme

*   A class that defines the default styles for each syntax pattern in Python code.
*   Implements the `SyntaxHighlightingTheme` interface.

Method Descriptions
------------------

### getKeywordStyle

*   Returns the style for keywords in Python code.
*   Returns a `TextStyle` object with the color set to `#399bc5`.

### getStringStyle

*   Returns the style for strings in Python code.
*   Returns a `TextStyle` object with the color set to `#007a09`.

### getCommentStyle

*   Returns the style for comments in Python code.
*   Returns a `TextStyle` object with the color set to `#888888` and font weight set to `Light`.

### getNumbersStyle

*   Returns the style for numbers in Python code.
*   Returns a `TextStyle` object with the color set to `#007a09`.

### getDefaultTextStyle

*   Returns the default style for text in Python code.
*   Returns a `TextStyle` object with the color set to `#FFFFFF`.

### getLanguageSpecificStyle

*   Returns the style for a specific language element in Python code.
*   Takes a string parameter representing the type of language element (e.g. "python_class", "python_function", etc.).
*   Returns a `TextStyle` object with the style defined for the specified language element.

Parameters and Return Values
-----------------------------

### getPythonSyntaxPatterns

*   Parameters:
    *   `theme`: a `SyntaxHighlightingTheme` object that provides the styles for each syntax pattern.
*   Return value:
    *   A list of `SyntaxPattern` objects that define the syntax patterns for highlighting Python code.

### PythonDefaultTheme

*   No parameters.
*   Return value:
    *   An instance of the `PythonDefaultTheme` class.

Usage Examples
-------------

```kotlin
// Create an instance of the PythonDefaultTheme class
val theme = PythonDefaultTheme()

// Get the syntax patterns for Python code using the default theme
val syntaxPatterns = getPythonSyntaxPatterns(theme)

// Use the syntax patterns to highlight Python code
// ...
```

```kotlin
// Create a custom theme by subclassing the PythonDefaultTheme class
class CustomTheme : PythonDefaultTheme() {
    override fun getKeywordStyle() = TextStyle(color = Color(0xff0000ff))
    // ...
}

// Create an instance of the custom theme
val customTheme = CustomTheme()

// Get the syntax patterns for Python code using the custom theme
val customSyntaxPatterns = getPythonSyntaxPatterns(customTheme)

// Use the custom syntax patterns to highlight Python code
// ...
```