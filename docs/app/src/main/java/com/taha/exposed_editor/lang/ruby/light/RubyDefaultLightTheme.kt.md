# Ruby Default Theme Documentation

## Overview

The RubyDefaultTheme class is a custom implementation of the SyntaxHighlightingTheme interface. It provides a set of predefined text styles for syntax highlighting in Ruby programming language. The theme defines styles for keywords, strings, comments, numbers, and various language-specific elements.

## Function Descriptions

### getKeywordStyle

Returns the text style for keywords in Ruby code.

* Parameters: None
* Return Value: TextStyle object with color #399bc5

### getStringStyle

Returns the text style for strings in Ruby code.

* Parameters: None
* Return Value: TextStyle object with color #007a09

### getCommentStyle

Returns the text style for comments in Ruby code.

* Parameters: None
* Return Value: TextStyle object with color #888888 and FontWeight.Light

### getNumbersStyle

Returns the text style for numbers in Ruby code.

* Parameters: None
* Return Value: TextStyle object with color #007a09

### getDefaultTextStyle

Returns the default text style for Ruby code.

* Parameters: None
* Return Value: TextStyle object with color #FFFFFF

### getLanguageSpecificStyle

Returns the text style for a specific language element in Ruby code. If the element is not found, it returns the default text style.

* Parameters: `tokenType` - a string representing the language element (e.g., "ruby_class", "ruby_method", etc.)
* Return Value: TextStyle object for the specified language element or the default text style if not found

## Language-Specific Styles

The RubyDefaultTheme class defines the following language-specific styles:

| Element | Color | Font Weight |
| --- | --- | --- |
| ruby_class | #A9E2F3 | Bold |
| ruby_method | #F781F3 | Regular |
| ruby_variable | Dark Gray | Regular |
| ruby_symbol | #c6a83b | Bold |
| ruby_constant | #F5A9D0 | Bold |
| ruby_operator | Magenta | Regular |
| ruby_bracket | Dark Gray | Regular |
| ruby_parenthesis | Dark Gray | Regular |
| ruby_brace | Dark Gray | Regular |
| ruby_parameter | #FD971F | Regular |
| ruby_local_variable | Dark Gray | Regular |
| ruby_global_variable | Dark Gray | Regular |
| ruby_instance_variable | #A6E22E | Regular |
| ruby_class_variable | #A6E22E | Regular |
| ruby_builtin_function | #CC7832 | Regular |

## Usage Examples

To use the RubyDefaultTheme class, you can create an instance of it and call the various methods to get the text styles for different language elements.

```kotlin
val theme = RubyDefaultTheme()

val keywordStyle = theme.getKeywordStyle()
val stringStyle = theme.getStringStyle()
val commentStyle = theme.getCommentStyle()
val numberStyle = theme.getNumbersStyle()

val rubyClassStyle = theme.getLanguageSpecificStyle("ruby_class")
val rubyMethodStyle = theme.getLanguageSpecificStyle("ruby_method")
```

Note: The color values are represented in hexadecimal format and can be adjusted according to personal preference.