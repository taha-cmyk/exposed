# Ruby Dark Theme
================

## Overview
----------

The Ruby Dark Theme is a custom theme for syntax highlighting in Ruby programming language. It provides a set of predefined text styles for keywords, strings, comments, numbers, and other language-specific elements.

## Function Descriptions
----------------------

### `getKeywordStyle()`

**Description**: Returns the text style for keywords in Ruby.

**Parameters**: None

**Returns**: A `TextStyle` object with the color set to a brighter blue (`#5ebfdd`).

**Example**:
```kotlin
val keywordStyle = RubyDarkTheme().getKeywordStyle()
```

### `getStringStyle()`

**Description**: Returns the text style for strings in Ruby.

**Parameters**: None

**Returns**: A `TextStyle` object with the color set to a brighter green (`#4caf50`).

**Example**:
```kotlin
val stringStyle = RubyDarkTheme().getStringStyle()
```

### `getCommentStyle()`

**Description**: Returns the text style for comments in Ruby.

**Parameters**: None

**Returns**: A `TextStyle` object with the color set to a lighter gray (`#757575`) and font weight set to light.

**Example**:
```kotlin
val commentStyle = RubyDarkTheme().getCommentStyle()
```

### `getNumbersStyle()`

**Description**: Returns the text style for numbers in Ruby.

**Parameters**: None

**Returns**: A `TextStyle` object with the color set to a brighter green (`#4caf50`).

**Example**:
```kotlin
val numbersStyle = RubyDarkTheme().getNumbersStyle()
```

### `getDefaultTextStyle()`

**Description**: Returns the default text style for Ruby.

**Parameters**: None

**Returns**: A `TextStyle` object with the color set to a light gray (`#E0E0E0`).

**Example**:
```kotlin
val defaultTextStyle = RubyDarkTheme().getDefaultTextStyle()
```

### `getLanguageSpecificStyle(tokenType: String)`

**Description**: Returns the text style for a specific language element in Ruby.

**Parameters**:

* `tokenType` (String): The type of language element (e.g. "ruby_class", "ruby_method", etc.)

**Returns**: A `TextStyle` object with the color and font weight set according to the language element type. If the token type is unknown, returns a default text style with a light gray color (`#E0E0E0`).

**Example**:
```kotlin
val classStyle = RubyDarkTheme().getLanguageSpecificStyle("ruby_class")
```

## API Reference
--------------

### `RubyDarkTheme`

* `getKeywordStyle()`: TextStyle
* `getStringStyle()`: TextStyle
* `getCommentStyle()`: TextStyle
* `getNumbersStyle()`: TextStyle
* `getDefaultTextStyle()`: TextStyle
* `getLanguageSpecificStyle(tokenType: String)`: TextStyle

### `TextStyle`

* `color`: Color
* `fontWeight`: FontWeight

## Usage Examples
---------------

```kotlin
val rubyDarkTheme = RubyDarkTheme()

val keywordStyle = rubyDarkTheme.getKeywordStyle()
val stringStyle = rubyDarkTheme.getStringStyle()
val commentStyle = rubyDarkTheme.getCommentStyle()
val numbersStyle = rubyDarkTheme.getNumbersStyle()
val defaultTextStyle = rubyDarkTheme.getDefaultTextStyle()

val classStyle = rubyDarkTheme.getLanguageSpecificStyle("ruby_class")
val methodStyle = rubyDarkTheme.getLanguageSpecificStyle("ruby_method")
```