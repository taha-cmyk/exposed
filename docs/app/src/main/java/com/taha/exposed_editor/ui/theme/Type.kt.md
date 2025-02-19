# Typography Configuration
=================================

## Overview
-----------

This code defines a set of Material typography styles for use in a Jetpack Compose application. It provides a basic configuration for text styles, including font family, weight, size, line height, and letter spacing.

## Typography Object
--------------------

### Description

The `Typography` object is a Material Design 3 typography configuration that provides a set of text styles to use throughout an application.

### Properties

* `bodyLarge`: The default text style for large body text.
* `titleLarge`, `labelSmall`, etc.: Optional text styles that can be uncommented and customized as needed.

### Usage Example

```kotlin
import com.taha.exposed_editor.ui.theme.Typography

// Use the Typography object in a Compose UI component
@Composable
fun MyText() {
    Text(
        text = "Hello, World!",
        style = Typography.bodyLarge
    )
}
```

## TextStyle Object
------------------

### Description

The `TextStyle` object represents a single text style configuration, including font family, weight, size, line height, and letter spacing.

### Parameters

* `fontFamily`: The font family to use for this text style. Defaults to `FontFamily.Default`.
* `fontWeight`: The font weight to use for this text style. Defaults to `FontWeight.Normal`.
* `fontSize`: The font size to use for this text style, in scaled pixels (sp).
* `lineHeight`: The line height to use for this text style, in scaled pixels (sp).
* `letterSpacing`: The letter spacing to use for this text style, in scaled pixels (sp).

### Usage Example

```kotlin
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Create a custom text style
val myStyle = TextStyle(
    fontFamily = FontFamily.SansSerif,
    fontWeight = FontWeight.Bold,
    fontSize = 18.sp,
    lineHeight = 22.sp,
    letterSpacing = 0.2.sp
)

// Use the custom text style in a Compose UI component
@Composable
fun MyText() {
    Text(
        text = "Hello, World!",
        style = myStyle
    )
}
```