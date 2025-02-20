Kotlin Syntax Highlighting Patterns
====================================

Overview
--------

This Kotlin function generates a list of syntax patterns for highlighting Kotlin code. It uses regular! expressions to match specific elements in the code, such as keywords, strings, numbers, comments, class definitions, function declarations, and more.

### Function Description

#### getKotlinSyntaxPatterns

`getKotlinSyntaxPatterns(theme: SyntaxHighlightingTheme): List<SyntaxPattern>`

This function returns a list of syntax patterns for highlighting Kotlin code. Each syntax pattern consists of a regular expression and a style from the provided theme.

### Parameters

*   `theme`: The theme to use for highlighting the code.

### Return Value

A list of syntax patterns for highlighting Kotlin code.

### Syntax Patterns

The following syntax patterns are generated by this function:

### 1. Keywords

*   Regex: `\b(fun|val|var|if|else|for|while|return|when|interface|class|object|typealias|this|super|null|true|false|is|as|in|!in|throw|try|catch|finally|import|package|lateinit|companion|data|sealed|enum|inline|crossinline|noinline|init)\b`
*   Style: `theme.getKeywordStyle()`

### 2. Strings

*   Regex: `(\"\"\".*?\"\"\"|\"[^\"]*\")` (with dot matches all option)
*   Style: `theme.getStringStyle()`

### 3. Multi-line Strings

*   Regex: `\"\"\"(.*?)\"\"\"` (with dot matches all option)
*   Style: `theme.getStringStyle()`

### 4. Numbers

*   Regex: `\b([0-9]+(\.[0-9]+)?|0x[0-9a-fA-F]+)\b`
*   Style: `theme.getNumbersStyle()`

### 5. Single-line Comments

*   Regex: `//.*`
*   Style: `theme.getCommentStyle()`

### 6. Multi-line Comments

*   Regex: `/\*[\\s\\S]*?\*/`
*   Style: `theme.getCommentStyle()`

### 7. Class Definitions

*   Regex: `\b(class|interface|object)\s+(\w+)`
*   Style: `theme.getLanguageSpecificStyle("kotlin_class")`

### 8. Function Declarations

*   Regex: `\bfun\s+([A-Za-z_][A-Za-z0-9_]*)`
*   Style: `theme.getLanguageSpecificStyle("kotlin_function")`

### 9. Properties and Variables

*   Regex: `\b(val|var)\s+(\w+)\s*:`
*   Style: `theme.getLanguageSpecificStyle("kotlin_property")`

### 10. Annotations

*   Regex: `@[\\w.]+`
*   Style: `theme.getLanguageSpecificStyle("kotlin_annotation")`

### 11. Type References

*   Regex: `:\s*([A-Z][\\w.]*)`
*   Style: `theme.getLanguageSpecificStyle("kotlin_type")`

### 12. Constants

*   Regex: `\b[A-Z][A-Z0-9_]+\b`
*   Style: `theme.getLanguageSpecificStyle("kotlin_constant")`

### 13. Operators

*   Regex: `[+\\-*/=%&|^~<>!?]+`
*   Style: `theme.getLanguageSpecificStyle("kotlin_operator")`

### 14. Brackets, Parentheses, and Braces

*   Regex: `[\\[\\]]`
*   Style: `theme.getLanguageSpecificStyle("kotlin_bracket")`
*   Regex: `[()]`
*   Style: `theme.getLanguageSpecificStyle("kotlin_parenthesis")`
*   Regex: `[{}]`
*   Style: `theme.getLanguageSpecificStyle("kotlin_brace")`

### 15. Function Parameters

*   Regex: `\\((\\s*\\w+\\s*:)`
*   Style: `theme.getLanguageSpecificStyle("kotlin_parameter")`

### 16. Local Variables

*   Regex: `\b(val|var)\s+(\w+)\s*=`
*   Style: `theme.getLanguageSpecificStyle("kotlin_local_variable")`

### 17. Global Variables

*   Regex: `^\\s*(val|var)\s+(\w+)\s*=`
*   Style: `theme.getLanguageSpecificStyle("kotlin_global_variable")`

### Usage Example

```kotlin
val theme = SyntaxHighlightingTheme()
val kotlinSyntaxPatterns = getKotlinSyntaxPatterns(theme)
for (pattern in kotlinSyntaxPatterns) {
    println("Pattern: