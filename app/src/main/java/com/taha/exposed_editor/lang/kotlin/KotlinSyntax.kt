package com.taha.exposed_editor.lang.kotlin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.taha.exposed_editor.lang.SyntaxHighlightingTheme
import com.taha.exposed_editor.lang.SyntaxPattern


fun getKotlinSyntaxPatterns(theme: SyntaxHighlightingTheme): List<SyntaxPattern> {
    return listOf(
        // Keywords
        SyntaxPattern(Regex("\\b(fun|val|var|if|else|for|while|return|when|interface|class|object|typealias|this|super|null|true|false|is|as|in|!in|throw|try|catch|finally|import|package|lateinit|copanion|data|sealed|enum|inline|crossinline|noinline|init)\\b"), theme.getKeywordStyle()),
        // Strings
        SyntaxPattern(
            Regex("(\"\"\".*?\"\"\"|\"[^\"]*\")", RegexOption.DOT_MATCHES_ALL),
            theme.getStringStyle()
        ),
        // Multi-line Strings
        SyntaxPattern(
            Regex("\"\"\"(.*?)\"\"\"", RegexOption.DOT_MATCHES_ALL),
            theme.getStringStyle()
        ),
        // Numbers
        SyntaxPattern(Regex("\\b([0-9]+(\\.[0-9]+)?|0x[0-9a-fA-F]+)\\b"), theme.getNumbersStyle()),
        // Single-line comments
        SyntaxPattern(Regex("//.*"), theme.getCommentStyle()),
        // Multi-line comments
        SyntaxPattern(Regex("/\\*[\\s\\S]*?\\*/"), theme.getCommentStyle()),
        // Class definitions
        SyntaxPattern(
            Regex("\\b(class|interface|object)\\s+(\\w+)"),
            theme.getLanguageSpecificStyle("kotlin_class")
        ),
        // Function declarations
        SyntaxPattern(
            Regex("\\bfun\\s+([A-Za-z_][A-Za-z0-9_]*)"),
            theme.getLanguageSpecificStyle("kotlin_function")
        ),
        // Properties and variables
        SyntaxPattern(
            Regex("\\b(val|var)\\s+(\\w+)\\s*:"),
            theme.getLanguageSpecificStyle("kotlin_property")
        ),
        // Annotations
        SyntaxPattern(
            Regex("@[\\w.]+"),
            theme.getLanguageSpecificStyle("kotlin_annotation")
        ),
        // Type references
        SyntaxPattern(
            Regex(":\\s*([A-Z][\\w.]*)"),
            theme.getLanguageSpecificStyle("kotlin_type")
        ),
        // Constants
        SyntaxPattern(
            Regex("\\b[A-Z][A-Z0-9_]+\\b"),
            theme.getLanguageSpecificStyle("kotlin_constant")
        ),
        // Operators
        SyntaxPattern(
            Regex("[+\\-*/=%&|^~<>!?]+"),
            theme.getLanguageSpecificStyle("kotlin_operator")
        ),
        // Brackets, parentheses, and braces
        SyntaxPattern(
            Regex("[\\[\\]]"),
            theme.getLanguageSpecificStyle("kotlin_bracket")
        ),
        SyntaxPattern(
            Regex("[()]"),
            theme.getLanguageSpecificStyle("kotlin_parenthesis")
        ),
        SyntaxPattern(
            Regex("[{}]"),
            theme.getLanguageSpecificStyle("kotlin_brace")
        ),
        // Function parameters
        SyntaxPattern(
            Regex("\\((\\s*\\w+\\s*:)"),
            theme.getLanguageSpecificStyle("kotlin_parameter")
        ),
        // Local variables
        SyntaxPattern(
            Regex("\\b(val|var)\\s+(\\w+)\\s*="),
            theme.getLanguageSpecificStyle("kotlin_local_variable")
        ),
        // Global variables
        SyntaxPattern(
            Regex("^\\s*(val|var)\\s+(\\w+)\\s*="),
            theme.getLanguageSpecificStyle("kotlin_global_variable")
        )



    )
}

class KotlinDefaultTheme : SyntaxHighlightingTheme {
    override fun getKeywordStyle() = TextStyle(color = Color(0xff399bc5))
    override fun getStringStyle() = TextStyle(color = Color(0xff007a09))
    override fun getCommentStyle() = TextStyle(color = Color(0xFF888888), fontWeight = FontWeight.Light)
    override fun getNumbersStyle(): TextStyle = TextStyle(color = Color(0xff007a09))
    override fun getDefaultTextStyle(): TextStyle = TextStyle(color = Color(0xFFFFFFFF))

    private val languageSpecificStyles: Map<String, TextStyle> = mapOf(
        "kotlin_class" to TextStyle(color = Color(0xFFA9E2F3), fontWeight = FontWeight.Bold),
        "kotlin_function" to TextStyle(color = Color(0xFFF781F3)),
        "kotlin_property" to TextStyle(color = Color(0xFF81F7F3)),
        "kotlin_annotation" to TextStyle(color = Color(0xffc6a83b), fontWeight = FontWeight.Bold),
        "kotlin_type" to TextStyle(color = Color.DarkGray, fontWeight = FontWeight.Bold),
        "kotlin_constant" to TextStyle(color = Color(0xFFF5A9D0), fontWeight = FontWeight.Bold),
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