Kotlin Default Theme
=====================

Overview
--------

The `KotlinDefaultTheme` class is a custom implementation of the `SyntaxHighlightingTheme` interface. It provides a set of predefined styles for syntax highlighting in Kotlin code editors.

### Syntax Highlighting Theme Interface

The `SyntaxHighlightingTheme` interface defines a set of methods that must be implemented by any syntax highlighting theme. These methods return `TextStyle` objects that define the visual appearance of different syntax elements in the code editor.

Function Descriptions
---------------------

### getKeywordStyle()

*   Returns a `TextStyle` object that defines the visual appearance of keywords in Kotlin code.
*   Parameters: None
*   Return value: `TextStyle` object with color `#399BC5`.

### getStringStyle()

*   Returns a `TextStyle` object that defines the visual appearance of string literals in Kotlin code.
*   Parameters: None
*   Return value: `TextStyle` object with color `#007A09`.

### getCommentStyle()

*   Returns a `TextStyle` object that defines the visual appearance of comments in Kotlin code.
*   Parameters: None
*   Return value: `TextStyle` object with color `#888888` and font weight `Light`.

### getNumbersStyle()

*   Returns a `TextStyle` object that defines the visual appearance of numbers in Kotlin code.
*   Parameters: None
*   Return value: `TextStyle` object with color `#007A09`.

### getDefaultTextStyle()

*   Returns a `TextStyle` object that defines the default visual appearance of text in the code editor.
*   Parameters: None
*   Return value: `TextStyle` object with color `#FFFFFF`.

### getLanguageSpecificStyle(tokenType: String)

*   Returns a `TextStyle` object that defines the visual appearance of a specific syntax element in Kotlin code.
*   Parameters: `tokenType` - a string that identifies the type of syntax element (e.g. "kotlin_class", "kotlin_function", etc.)
*   Return value: `TextStyle` object that defines the visual appearance of the specified syntax element, or a default `TextStyle` object with color `#FFFFFF` if the token type is not recognized.

Language Specific Styles
------------------------

The `KotlinDefaultTheme` class defines a set of language specific styles that can be used to customize the appearance of Kotlin code in the editor. These styles are stored in a map and can be retrieved using the `getLanguageSpecificStyle(tokenType: String)` method.

The following language specific styles are defined:

*   `kotlin_class`: `TextStyle` object with color `#A9E2F3` and font weight `Bold`.
*   `kotlin_function`: `TextStyle` object with color `#F781F3`.
*   `kotlin_property`: `TextStyle` object with color `#81F7F3`.
*   `kotlin_annotation`: `TextStyle` object with color `#C6A83B` and font weight `Bold`.
*   `kotlin_type`: `TextStyle` object with color `#DarkGray` and font weight `Bold`.
*   `kotlin_constant`: `TextStyle` object with color `#F5A9D0` and font weight `Bold`.
*   `kotlin_operator`: `TextStyle` object with color `#Magenta`.
*   `kotlin_separator`: `TextStyle` object with color `#DarkGray`.
*   `kotlin_bracket`: `TextStyle` object with color `#DarkGray`.
*   `kotlin_parenthesis`: `TextStyle` object with color `#DarkGray`.
*   `kotlin_brace`: `TextStyle` object with color `#DarkGray`.
*   `kotlin_parameter`: `TextStyle` object with color `#FD971F`.
*   `kotlin_local_variable`: `TextStyle` object with color `#96CBFE`.
*   `kotlin_global_variable`: `TextStyle` object with color `#66D9EF`.

Usage Examples
-------------

To use the `KotlinDefaultTheme` class, you can create an instance of it and pass it to a code editor or syntax highlighting component.

```kotlin
val theme = KotlinDefaultTheme()
// Pass the theme to a code editor or syntax highlighting component
```

You can also customize the appearance of Kotlin code by retrieving a `TextStyle` object for a specific syntax element and modifying its properties.

```kotlin
val classStyle = theme.getLanguageSpecificStyle("kotlin_class")
// Modify the properties of the TextStyle object
classStyle.color = Color(0xFF0000FF)
```

Note that the `KotlinDefaultTheme` class is designed to be used with Kotlin code editors and syntax highlighting components. It may not be compatible with other programming languages or syntax highlighting systems.