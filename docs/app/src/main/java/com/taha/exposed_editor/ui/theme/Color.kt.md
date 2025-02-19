# Exposed Editor Theme Colors
=====================================

## Overview
------------

This package provides a set of predefined colors for the Exposed Editor theme. The colors are defined as vals, making them easily accessible and reusable throughout the application.

## Color Palette
-----------------

The color palette consists of six colors, divided into two categories: pastel colors and deep colors.

### Pastel Colors

* `Purple80`: A light purple color.
* `PurpleGrey80`: A light grey-purple color.
* `Pink80`: A light pink color.

### Deep Colors

* `Purple40`: A deep purple color.
* `PurpleGrey40`: A deep grey-purple color.
* `Pink40`: A deep pink color.

## Color Values
-----------------

Each color is defined as a val, with its value represented as a hexadecimal code.

### Pastel Colors

#### `Purple80`
```kotlin
val Purple80 = Color(0xFFD0BCFF)
```
A light purple color.

#### `PurpleGrey80`
```kotlin
val PurpleGrey80 = Color(0xFFCCC2DC)
```
A light grey-purple color.

#### `Pink80`
```kotlin
val Pink80 = Color(0xFFEFB8C8)
```
A light pink color.

### Deep Colors

#### `Purple40`
```kotlin
val Purple40 = Color(0xFF6650a4)
```
A deep purple color.

#### `PurpleGrey40`
```kotlin
val PurpleGrey40 = Color(0xFF625b71)
```
A deep grey-purple color.

#### `Pink40`
```kotlin
val Pink40 = Color(0xFF7D5260)
```
A deep pink color.

## Usage Examples
-----------------

To use these colors in your application, simply import the package and access the desired color val.

```kotlin
import com.taha.exposed_editor.ui.theme.*

// Example usage:
val backgroundColor = Purple80
val textColor = Purple40
```

You can use these colors to style your application's UI elements, such as backgrounds, text, and buttons.

```kotlin
Text(
    text = "Hello, World!",
    color = textColor,
    backgroundColor = backgroundColor
)
```

By using these predefined colors, you can maintain a consistent visual style throughout your application.