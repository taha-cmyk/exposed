**Exposed Editor UI Theme Documentation**
=============================================

Overview
--------

This code defines a customizable theme for the Exposed Editor UI, built using Jetpack Compose. The theme is designed to adapt to different Android versions, supporting dynamic colors on Android 12 and above.

Function Descriptions
--------------------

### `Theme`

The `Theme` function is a composable function that wraps the content of the Exposed Editor UI with a customizable theme. It takes three parameters:

#### Parameters

* `darkTheme`: a boolean indicating whether to use a dark theme. Defaults to the system's dark theme setting.
* `dynamicColor`: a boolean indicating whether to use dynamic colors on Android 12 and above. Defaults to `true`.
* `content`: a composable function that represents the content to be wrapped with the theme.

#### Return Value

The `Theme` function returns a composable function that wraps the provided `content` with the selected theme.

### `dynamicDarkColorScheme` and `dynamicLightColorScheme`

These functions are used to create dynamic color schemes on Android 12 and above. They take a `context` parameter and return a `ColorScheme` object.

### `darkColorScheme` and `lightColorScheme`

These functions are used to create static color schemes for dark and light themes, respectively.

Usage Examples
-------------

```kotlin
// Use the theme with default settings
Theme {
    // content to be wrapped with the theme
}

// Use the theme with a custom dark theme setting
Theme(darkTheme = true) {
    // content to be wrapped with the theme
}

// Use the theme with dynamic colors disabled
Theme(dynamicColor = false) {
    // content to be wrapped with the theme
}
```

Color Schemes
-------------

The theme uses two predefined color schemes: `DarkColorScheme` and `LightColorScheme`. These schemes define the primary, secondary, and tertiary colors, as well as background, surface, and text colors.

```kotlin
private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40,

    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
)
```

Customization
-------------

To customize the theme, you can create your own color schemes using the `darkColorScheme` and `lightColorScheme` functions. You can then pass these schemes to the `Theme` function to use them.

```kotlin
val CustomDarkColorScheme = darkColorScheme(
    primary = Color.Red,
    secondary = Color.Green,
    tertiary = Color.Blue
)

val CustomLightColorScheme = lightColorScheme(
    primary = Color.Cyan,
    secondary = Color.Magenta,
    tertiary = Color.Yellow
)

Theme(darkTheme = true, dynamicColor = false) {
    MaterialTheme(
        colorScheme = CustomDarkColorScheme,
        typography = Typography,
        content = {
            // content to be wrapped with the custom theme
        }
    )
}
```