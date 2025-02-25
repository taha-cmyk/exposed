Ruby Default Light Theme
==========================

Overview
--------

The Ruby Default Light Theme is a class that implements the `SyntaxHighlightingTheme` interface to provide a default light theme for Ruby syntax highlighting. It defines various styles for different elements of Ruby code, such as keywords, strings, comments, numbers, and language-specific tokens.

### API Reference

#### `RubyDefaultTheme()`

**Description**: Constructs a new instance of the Ruby Default Light Theme.

**Parameters**: None

**Returns**: A new instance of the Ruby Default Light Theme.

#### `getKeywordStyle()`

**Description**: Returns the text style for keywords in Ruby code.

**Parameters**: None

**Returns**: A `TextStyle` object with the color set to `#399bc5`.

**Example**:
```kotlin
val theme = RubyDefaultTheme()
val keywordStyle = theme.getKeywordStyle()
```

#### `getStringStyle()`

**Description**: Returns the text style for strings in Ruby code.

**Parameters**: None

**Returns**: A `TextStyle` object with the color set to `#007a09`.

**Example**:
```kotlin
val theme = RubyDefaultTheme()
val stringStyle = theme.getStringStyle()
```

#### `getCommentStyle()`

**Description**: Returns the text style for comments in Ruby code.

**Parameters**: None

**Returns**: A `TextStyle` object with the color set to `#888888` and font weight set to light.

**Example**:
```kotlin
val theme = RubyDefaultTheme()
val commentStyle = theme.getCommentStyle()
```

#### `getNumbersStyle()`

**Description**: Returns the text style for numbers in Ruby code.

**Parameters**: None

**Returns**: A `TextStyle` object with the color set to `#007a09`.

**Example**:
```kotlin
val theme = RubyDefaultTheme()
val numbersStyle = theme.getNumbersStyle()
```

#### `getDefaultTextStyle()`

**Description**: Returns the default text style for Ruby code.

**Parameters**: None

**Returns**: A `TextStyle` object with the color set to `#FFFFFF`.

**Example**:
```kotlin
val theme = RubyDefaultTheme()
val defaultStyle = theme.getDefaultTextStyle()
```

#### `getLanguageSpecificStyle(tokenType: String)`

**Description**: Returns the text style for a specific language token in Ruby code.

**Parameters**:

* `tokenType` (String): The type of language token.

**Returns**: A `TextStyle` object corresponding to the specified token type, or a default `TextStyle` object if the token type is not found.

**Example**:
```kotlin
val theme = RubyDefaultTheme()
val rubyClassStyle = theme.getLanguageSpecificStyle("ruby_class")
```

### Language-Specific Token Styles

The Ruby Default Light Theme defines the following language-specific token styles:

* `ruby_class`: `TextStyle` object with color set to `#A9E2F3` and font weight set to bold.
* `ruby_method`: `TextStyle` object with color set to `#F781F3`.
* `ruby_variable`: `TextStyle` object with color set to dark gray.
* `ruby_symbol`: `TextStyle` object with color set to `#c6a83b` and font weight set to bold.
* `ruby_constant`: `TextStyle` object with color set to `#F5A9D0` and font weight set to bold.
* `ruby_operator`: `TextStyle` object with color set to magenta.
* `ruby_bracket`: `TextStyle` object with color set to dark gray.
* `ruby_parenthesis`: `TextStyle` object with color set to dark gray.
* `ruby_brace`: `TextStyle` object with color set to dark gray.
* `ruby_parameter`: `TextStyle` object with color set to `#FD971F`.
* `ruby_local_variable`: `TextStyle` object with color set to dark gray.
* `ruby_global_variable`: `TextStyle` object with color set to dark gray.
* `ruby_instance_variable`: `TextStyle` object with color set to `#A6E22E`.
* `ruby_class_variable`: `TextStyle` object with color set to `#A6E22E`.
* `ruby_builtin_function`: `TextStyle` object with color set to `#CC7832`.