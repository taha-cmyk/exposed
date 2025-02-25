Ruby Theme Provider Documentation
=====================================

Overview
--------

This is a Ruby theme provider module that provides different syntax highlighting themes for the Ruby programming language. It currently supports two themes: a default light theme and a dark theme.

Function Descriptions
--------------------

### `getRubyTheme(theme: RubyThemes)`

**Description**: Returns a syntax highlighting theme for the Ruby programming language based on the provided theme type.

**Parameters**:
- `theme` (RubyThemes): The type of theme to return.

**Returns**: A `SyntaxHighlightingTheme` object representing the chosen theme.

**Throws**: None

**Example**:
```kotlin
val defaultTheme = getRubyTheme(RubyThemes.DEFAULT)
val darkTheme = getRubyTheme(RubyThemes.DARK)
```

API Reference
-------------

### `RubyThemes`

**Description**: An enum class representing the different types of Ruby themes available.

**Values**:
- `DEFAULT`: The default light theme.
- `DARK`: The dark theme.

### `getRubyTheme(theme: RubyThemes)`

**Description**: Returns a syntax highlighting theme for the Ruby programming language based on the provided theme type.

**Parameters**:
- `theme` (RubyThemes): The type of theme to return.

**Returns**: A `SyntaxHighlightingTheme` object representing the chosen theme.

**Throws**: None

**Example**:
```kotlin
val defaultTheme = getRubyTheme(RubyThemes.DEFAULT)
val darkTheme = getRubyTheme(RubyThemes.DARK)
```

Usage Examples
-------------

To use this module, simply call the `getRubyTheme` function with the desired theme type:
```kotlin
val theme = getRubyTheme(RubyThemes.DEFAULT)
// Use the theme object to apply syntax highlighting
```
You can also switch between themes by changing the `theme` parameter:
```kotlin
val theme = getRubyTheme(RubyThemes.DARK)
// Use the dark theme object to apply syntax highlighting
```