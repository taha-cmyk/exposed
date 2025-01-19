
# Compose Code Syntax Highlighter

A flexible and extensible syntax highlighting library for Jetpack Compose text fields. This library allows easy addition of new programming languages and custom themes.

## Features

- 🎨 Syntax highlighting for multiple programming languages
- 🔌 Easy to extend with new languages
- 🎯 Custom theme support
- 🛠 Built for Jetpack Compose
- ⚡ Real-time highlighting
- 📱 Mobile-friendly

![image](/docs/s1.png)
![image](/docs/s2.png)



## Getting Started

### Basic Usage

```kotlin
 val patterns = SyntaxProvider.getSyntaxPatterns(Language.RUBY,getRubyTheme(RubyThemes.DEFAULT))

 SyntaxHighlightedTextField(
     code = """                                 
     """.trimIndent(),
     patterns = patterns
 )
 }
```

### Template for New Language

```kotlin

fun getKotlinSyntaxPatterns(theme: SyntaxHighlightingTheme): List<SyntaxPattern> {
   return listOf(
       // your syntax patterns here
       // eg : 
        SyntaxPattern(Regex("\\b(fun|val|var)\\b"), theme.getKeywordStyle()),
   )
}
```

### implement SyntaxHighlightingTheme Interface for new language theme

```kotlin
class KotlinDefaultTheme : SyntaxHighlightingTheme {
   override fun getKeywordStyle() = TextStyle(color = Color(0xFFFF5733), fontWeight = FontWeight.Bold)
   override fun getStringStyle() = TextStyle(color = Color(0xFF33FF57))
   override fun getCommentStyle() = TextStyle(color = Color(0xFF888888), fontWeight = FontWeight.Light)
   override fun getNumbersStyle(): TextStyle = TextStyle(color = Color(0xFF33FF57))
   override fun getDefaultTextStyle(): TextStyle = TextStyle(color = Color(0xFFFFFFFF))

   private val languageSpecificStyles: Map<String, TextStyle> = mapOf(
      "kotlin_class" to TextStyle(color = Color(0xFFA9E2F3), fontWeight = FontWeight.Bold),
      "kotlin_function" to TextStyle(color = Color(0xFFF781F3)),
      "kotlin_property" to TextStyle(color = Color(0xFF81F7F3)),
      "kotlin_annotation" to TextStyle(color = Color(0xFFF5DA81), fontWeight = FontWeight.Bold),
      "kotlin_type" to TextStyle(color = Color(0xFFA9F5A9), fontWeight = FontWeight.Bold),
      "kotlin_constant" to TextStyle(color = Color(0xFFF5A9D0), fontWeight = FontWeight.Bold),
      "kotlin_string" to TextStyle(color = Color(0xFFE6CEAC)),
      "kotlin_number" to TextStyle(color = Color(0xFFBDBDBD)),
      "kotlin_comment" to TextStyle(color = Color(0xFF999999), fontStyle = FontStyle.Italic),
      "kotlin_keyword" to TextStyle(color = Color(0xFFB57d00), fontWeight = FontWeight.Bold),
      "kotlin_operator" to TextStyle(color = Color.Magenta),
      "kotlin_separator" to TextStyle(color = Color.DarkGray),
      "kotlin_bracket" to TextStyle(color = Color.DarkGray),
      "kotlin_parenthesis" to TextStyle(color = Color.DarkGray),
      "kotlin_brace" to TextStyle(color = Color.DarkGray),
      "kotlin_parameter" to TextStyle(color = Color(0xFFFD971F)),
      "kotlin_local_variable" to TextStyle(color = Color(0xFF96CBFE)),
      "kotlin_global_variable" to TextStyle(color = Color(0xFF66D9EF)),

      )

   override fun getLanguageSpecificStyle(tokenType: String): TextStyle {
      return languageSpecificStyles[tokenType] ?: TextStyle(color = Color(0xFFFFFFFF))
   }
}
```


## Best Practices

1. **Regex Optimization**
    - Keep patterns simple and specific
    - Test patterns with various code samples
    - Consider performance implications for large files

2. **Language Specifics**
    - Include all important language keywords
    - Handle special cases (e.g., template literals in JavaScript)
    - Consider language-specific commenting styles

3. **Style Consistency**
    - Follow consistent color schemes
    - Consider color contrast for readability
    - Test themes in both light and dark modes

## Contributing

1. Fork the repository
2. Create a new branch for your language implementation
3. Add your language class
4. Add tests for your implementation
5. Submit a pull request

### Contribution Checklist

- [ ] Language class extends BaseLanguageSyntax
- [ ] All major language keywords are included
- [ ] Regex patterns are tested and optimized
- [ ] Documentation is updated
- [ ] Tests are included
- [ ] Code follows project style guidelines

## Testing Your Implementation

```kotlin
@Preview
@Composable
fun PreviewHighlightedCodeEditor() {
    val patterns = SyntaxProvider.getSyntaxPatterns(Language.RUBY,getRubyTheme(RubyThemes.DEFAULT))

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
}

```

## Common Issues and Solutions

### Issue: Regex Pattern Not Matching
- Ensure patterns are properly escaped
- Test patterns in isolation
- Use regex testing tools to validate patterns

### Issue: Performance Problems
- Simplify complex regex patterns
- Combine similar patterns
- Consider using lazy matching where appropriate

## License
MIT



---

We welcome contributions! If you've created a syntax highlighter for a new language, please share it with the community by submitting a pull request.

