# Exposed Editor Documentation

## Overview

The Exposed Editor is a code editor application for Android devices. It provides syntax highlighting for various programming languages, including Ruby. The application uses Jetpack Compose for its user interface and is highly customizable.

## Function Descriptions

### `SyntaxProvider.getSyntaxPatterns`

This function returns a list of syntax patterns for a given language and theme.

* Parameters:
	+ `language`: The programming language for which to retrieve syntax patterns (e.g., `Language.RUBY`).
	+ `theme`: The theme to apply to the syntax patterns (e.g., `getRubyTheme(RubyThemes.DEFAULT)`).
* Return Value: A list of syntax patterns.

### `getRubyTheme`

This function returns a Ruby theme based on the provided theme ID.

* Parameters:
	+ `themeId`: The ID of the theme to retrieve (e.g., `RubyThemes.DEFAULT`).
* Return Value: A Ruby theme object.

### `SyntaxHighlightedTextField`

This is a Jetpack Compose UI component that displays a text field with syntax highlighting.

* Parameters:
	+ `code`: The code to display in the text field.
	+ `patterns`: A list of syntax patterns to apply to the code.
* Return Value: A UI component displaying the syntax-highlighted code.

## Usage Examples

### Basic Usage

To use the Exposed Editor, you can create a `SyntaxHighlightedTextField` component and pass in the code and syntax patterns:
```kotlin
val patterns = SyntaxProvider.getSyntaxPatterns(Language.RUBY, getRubyTheme(RubyThemes.DEFAULT))

SyntaxHighlightedTextField(
    code = """
    # The Greeter class
    class Greeter
      def initialize(name)
        @name = name.capitalize
      end

      def salute
        puts "Hello #{@name}!"
      end
    end

    # Create a new object
    g = Greeter.new("world")

    # Output "Hello World!"
    g.salute
    """.trimIndent(),
    patterns = patterns
)
```
### Customizing the Theme

To customize the theme, you can pass a different theme ID to the `getRubyTheme` function:
```kotlin
val patterns = SyntaxProvider.getSyntaxPatterns(Language.RUBY, getRubyTheme(RubyThemes.DARK))

SyntaxHighlightedTextField(
    code = """
    # The Greeter class
    class Greeter
      def initialize(name)
        @name = name.capitalize
      end

      def salute
        puts "Hello #{@name}!"
      end
    end

    # Create a new object
    g = Greeter.new("world")

    # Output "Hello World!"
    g.salute
    """.trimIndent(),
    patterns = patterns
)
```
### Previewing the Code Editor

To preview the code editor, you can use the `@Preview` annotation and create a `PreviewHighlightedCodeEditor` composable function:
```kotlin
@Preview
@Composable
fun PreviewHighlightedCodeEditor() {
    val patterns = SyntaxProvider.getSyntaxPatterns(Language.RUBY, getRubyTheme(RubyThemes.DEFAULT))

    SyntaxHighlightedTextField(
        code = """
        # The Greeter class
        class Greeter
          def initialize(name)
            @name = name.capitalize
          end

          def salute
            puts "Hello #{@name}!"
          end
        end

        # Create a new object
        g = Greeter.new("world")

        # Output "Hello World!"
        g.salute
        """.trimIndent(),
        patterns = patterns
    )
}
```
This will allow you to preview the code editor in Android Studio.