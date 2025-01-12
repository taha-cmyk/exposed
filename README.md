
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
@Composable
fun CodeEditor() {
    var code by remember { mutableStateOf("") }
    
    SyntaxHighlightedTextField(
        value = code,
        onValueChange = { code = it },
        languageSyntax = KotlinSyntax()  // Or any other language implementation
    )
}
```
## Adding a New Language

To add support for a new programming language, create a new class that extends `BaseLanguageSyntax`. Here's a step-by-step guide:

1. Create a new Kotlin file for your language (e.g., `RubySyntax.kt`)
2. Extend the `BaseLanguageSyntax` class
3. Override the required properties
4. Define your syntax rules

### Template for New Language

```kotlin
class NewLanguageSyntax : BaseLanguageSyntax() {
    override val languageName: String = "YourLanguageName"
    
    override val rules: List<SyntaxRule> = listOf(
        // Keywords
        *createKeywordRules(
            listOf(
                "keyword1", "keyword2", "keyword3"
                // Add your language keywords here
            ),
            SpanStyle(color = Color.Blue)  // Define keyword style
        ).toTypedArray(),
        
        // Numbers
        SyntaxRule(
            pattern = Regex("\\b\\d+(\\.\\d+)?\\b"),
            style = SpanStyle(color = Color.Magenta)
        ),
        
        // Add more rules for your language
    )
}
```

### Syntax Rule Components

Each `SyntaxRule` consists of two main components:

1. **Pattern**: A Regex pattern to match specific code elements
2. **Style**: A `SpanStyle` defining how the matched text should be displayed

### Common Regex Patterns

Here are some commonly used regex patterns for syntax highlighting:

```kotlin
// Numbers
Regex("\\b\\d+(\\.\\d+)?\\b")  // Matches integers and decimals

// String literals
Regex("\"[^\"]*\"")            // Matches "double-quoted strings"
Regex("'[^']*'")               // Matches 'single-quoted strings'

// Comments
Regex("//.*")                  // Matches single-line comments
Regex("/\\*[\\s\\S]*?\\*/")    // Matches multi-line comments

// Function declarations
Regex("\\b\\w+\\s*\\(")        // Matches function calls

// Variables
Regex("\\b[a-zA-Z_]\\w*\\b")   // Matches variable names
```

## Creating Custom Themes

You can create custom themes by defining a new `SyntaxTheme`:

```kotlin
val customTheme = SyntaxTheme(
    keywordColor = Color(0xFF569CD6),    // Color for keywords
    numberColor = Color(0xFFB5CEA8),     // Color for numbers
    stringColor = Color(0xFFCE9178),     // Color for strings
    commentColor = Color(0xFF6A9955),    // Color for comments
    defaultTextColor = Color(0xFFD4D4D4)  // Default text color
)
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
fun PreviewNewLanguage() {
    var code by remember { mutableStateOf(
        """
        // Add sample code in your language here
        // This will help test syntax highlighting
        """
    ) }
    
    SyntaxHighlightedTextField(
        value = code,
        onValueChange = { code = it },
        languageSyntax = YourNewLanguageSyntax()
    )
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

