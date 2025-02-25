Kotlin Default Light Theme
==========================

Overview
--------

The Kotlin Default Light Theme is a class that implements the `SyntaxHighlightingTheme` interface. It provides a set of predefined styles for syntax highlighting in Kotlin programming language.

### Class Description

The `KotlinDefaultTheme` class provides a set of methods that return `TextStyle` objects, which define the appearance of different syntax elements in Kotlin code.

API Reference
-------------

### `getKeywordStyle()`

**Description**: Returns the text style for keywords in Kotlin code.

**Parameters**: None

**Returns**: A `TextStyle` object with the color set to `#399bc5`.

**Example**:
```kotlin
val keywordStyle = KotlinDefaultTheme().getKeywordStyle()
```

### `getStringStyle()`

**Description**: Returns the text style for strings in Kotlin code.

**Parameters**: None

**Returns**: A `TextStyle` object with the color set to `#007a09`.

**Example**:
```kotlin
val stringStyle = KotlinDefaultTheme().getStringStyle()
```

### `getCommentStyle()`

**Description**: Returns the text style for comments in Kotlin code.

**Parameters**: None

**Returns**: A `TextStyle` object with the color set to `#888888` and font weight set to `FontWeight.Light`.

**Example**:
```kotlin
val commentStyle = KotlinDefaultTheme().getCommentStyle()
```

### `getNumbersStyle()`

**Description**: Returns the text style for numbers in Kotlin code.

**Parameters**: None

**Returns**: A `TextStyle` object with the color set to `#007a09`.

**Example**:
```kotlin
val numbersStyle = KotlinDefaultTheme().getNumbersStyle()
```

### `getDefaultTextStyle()`

**Description**: Returns the default text style for Kotlin code.

**Parameters**: None

**Returns**: A `TextStyle` object with the color set to `#FFFFFF`.

**Example**:
```kotlin
val defaultTextStyle = KotlinDefaultTheme().getDefaultTextStyle()
```

### `getLanguageSpecificStyle(tokenType: String)`

**Description**: Returns the text style for a specific language token type in Kotlin code.

**Parameters**:

* `tokenType` (String): The type of the language token.

**Returns**: A `TextStyle` object that corresponds to the given token type, or a default style if the token type is not found.

**Example**:
```kotlin
val classStyle = KotlinDefaultTheme().getLanguageSpecificStyle("kotlin_class")
```

Public Properties
-----------------

* `languageSpecificStyles`: A map of language-specific styles, where each key is a token type and each value is a `TextStyle` object.

Usage Examples
-------------

```kotlin
val theme = KotlinDefaultTheme()

val keywordStyle = theme.getKeywordStyle()
val stringStyle = theme.getStringStyle()
val commentStyle = theme.getCommentStyle()
val numbersStyle = theme.getNumbersStyle()
val defaultTextStyle = theme.getDefaultTextStyle()

val classStyle = theme.getLanguageSpecificStyle("kotlin_class")
val functionStyle = theme.getLanguageSpecificStyle("kotlin_function")
```

Note that the `languageSpecificStyles` map contains the following token types:

* `kotlin_class`
* `kotlin_function`
* `kotlin_property`
* `kotlin_annotation`
* `kotlin_type`
* `kotlin_constant`
* `kotlin_operator`
* `kotlin_separator`
* `kotlin_bracket`
* `kotlin_parenthesis`
* `kotlin_brace`
* `kotlin_parameter`
* `kotlin_local_variable`
* `kotlin_global_variable`

Each token type corresponds to a specific style in the `languageSpecificStyles` map. If a token type is not found in the map, the `getLanguageSpecificStyle` method returns a default style.