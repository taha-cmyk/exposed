# Syntax Provider Documentation

## Overview

The Syntax Provider is a utility object that provides syntax highlighting patterns and default themes for various programming languages. It supports four languages: Kotlin, Python, Ruby, and JavaScript.

## Function Descriptions

### `getSyntaxPatterns(language: Language, theme: SyntaxHighlightingTheme): List<SyntaxPattern>`

This function returns a list of syntax patterns for a given language and theme. It uses a when-expression to determine which language-specific function to call.

#### Parameters

* `language`: The language for which to retrieve syntax patterns.
* `theme`: The theme to apply to the syntax patterns.

#### Return Value

A list of `SyntaxPattern` objects for the specified language and theme.

### `getDefaultTheme(language: Language): SyntaxHighlightingTheme`

This function returns the default theme for a given language. It uses a when-expression to determine which language-specific theme to return.

#### Parameters

* `language`: The language for which to retrieve the default theme.

#### Return Value

A `SyntaxHighlightingTheme` object representing the default theme for the specified language.

## Enum Description

### `enum class Language`

This enum class represents the supported programming languages.

#### Values

* `KOTLIN`
* `PYTHON`
* `RUBY`
* `JAVASCRIPT`

## Usage Examples

### Retrieving Syntax Patterns

```kotlin
val kotlinSyntaxPatterns = SyntaxProvider.getSyntaxPatterns(Language.KOTLIN, KotlinDefaultTheme())
val pythonSyntaxPatterns = SyntaxProvider.getSyntaxPatterns(Language.PYTHON, PythonDefaultTheme())
```

### Retrieving Default Themes

```kotlin
val kotlinDefaultTheme = SyntaxProvider.getDefaultTheme(Language.KOTLIN)
val rubyDefaultTheme = SyntaxProvider.getDefaultTheme(Language.RUBY)
```

### Using the `Language` Enum

```kotlin
val language = Language.JAVASCRIPT
val syntaxPatterns = SyntaxProvider.getSyntaxPatterns(language, JavaScriptDefaultTheme())
```