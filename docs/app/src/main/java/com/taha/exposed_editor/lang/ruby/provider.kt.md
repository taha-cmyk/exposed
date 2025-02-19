**Ruby Themes Documentation**
================================

### Overview

This module provides a set of predefined themes for syntax highlighting in Ruby programming language. It allows users to easily switch between different themes, currently supporting a default light theme and a dark theme.

### Enum Class: RubyThemes
---------------------------

#### Description

An enumeration of available Ruby themes.

#### Values

* `DEFAULT`: The default light theme.
* `DARK`: The dark theme.

### Function: getRubyTheme
---------------------------

#### Description

Returns the corresponding `SyntaxHighlightingTheme` object for the given `RubyThemes` enum value.

#### Parameters

* `theme`: The desired Ruby theme, represented as a `RubyThemes` enum value.

#### Return Value

The `SyntaxHighlightingTheme` object associated with the given theme.

#### Usage Examples

```kotlin
// Get the default Ruby theme
val defaultTheme: SyntaxHighlightingTheme = getRubyTheme(RubyThemes.DEFAULT)

// Get the dark Ruby theme
val darkTheme: SyntaxHighlightingTheme = getRubyTheme(RubyThemes.DARK)
```

### Theme Classes
------------------

#### RubyDefaultTheme

* A light-themed implementation of `SyntaxHighlightingTheme` for Ruby.

#### RubyDarkTheme

* A dark-themed implementation of `SyntaxHighlightingTheme` for Ruby.

Note: The implementation details of these theme classes are not included in this documentation, as they are assumed to be provided separately.