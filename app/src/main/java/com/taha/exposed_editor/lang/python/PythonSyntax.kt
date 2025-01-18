package com.taha.exposed_editor.lang.python


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.taha.exposed_editor.lang.SyntaxHighlightingTheme
import com.taha.exposed_editor.lang.SyntaxPattern

fun getPythonSyntaxPatterns(theme: SyntaxHighlightingTheme): List<SyntaxPattern> {
    return listOf(
        // Keywords
        SyntaxPattern(Regex("\\b(and|as|assert|async|await|break|class|continue|def|del|elif|else|except|finally|for|from|global|if|import|in|is|lambda|nonlocal|not|or|pass|raise|return|try|while|with|yield|True|False|None)\\b"), theme.getKeywordStyle()),
        // Strings
        SyntaxPattern(
            Regex("(\"\"\".*?\"\"\"|\"\"\".*?\"\"\"|\"[^\"]*\")", RegexOption.DOT_MATCHES_ALL),
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
        SyntaxPattern(Regex("#.*"), theme.getCommentStyle()),
        // Multi-line comments
        SyntaxPattern(
            Regex("\"\"\"[\\s\\S]*?\"\"\"", RegexOption.DOT_MATCHES_ALL),
            theme.getCommentStyle()
        ),
        // Class definitions
        SyntaxPattern(
            Regex("\\bclass\\s+(\\w+)"),
            theme.getLanguageSpecificStyle("python_class")
        ),
        // Function declarations
        SyntaxPattern(
            Regex("\\bdef\\s+(\\w+)\\s*\\("),
            theme.getLanguageSpecificStyle("python_function")
        ),
        // Variables
        SyntaxPattern(
            Regex("\\b(\\w+)\\s*="),
            theme.getLanguageSpecificStyle("python_variable")
        ),
        // Annotations
        SyntaxPattern(
            Regex("@[\\w.]+"),
            theme.getLanguageSpecificStyle("python_annotation")
        ),
        // Type hints
        SyntaxPattern(
            Regex(":\\s*([A-Z][\\w.]*)"),
            theme.getLanguageSpecificStyle("python_type")
        ),
        // Constants (Python doesn't have constants, but we can highlight uppercase variables)
        SyntaxPattern(
            Regex("\\b[A-Z][A-Z0-9_]+\\b"),
            theme.getLanguageSpecificStyle("python_constant")
        ),
        // Operators
        SyntaxPattern(
            Regex("[+\\-*/=%&|^~<>!?]+"),
            theme.getLanguageSpecificStyle("python_operator")
        ),
        // Brackets, parentheses, and braces
        SyntaxPattern(
            Regex("[\\[\\]]"),
            theme.getLanguageSpecificStyle("python_bracket")
        ),
        SyntaxPattern(
            Regex("[()]"),
            theme.getLanguageSpecificStyle("python_parenthesis")
        ),
        SyntaxPattern(
            Regex("[{}]"),
            theme.getLanguageSpecificStyle("python_brace")
        ),
        // Function parameters
        SyntaxPattern(
            Regex("\\((\\s*\\w+\\s*:)"),
            theme.getLanguageSpecificStyle("python_parameter")
        ),
        // Local variables (Python doesn't have explicit local variable declarations)
        SyntaxPattern(
            Regex("\\b(\\w+)\\s*="),
            theme.getLanguageSpecificStyle("python_local_variable")
        ),
        // Global variables
        SyntaxPattern(
            Regex("^\\s*(\\w+)\\s*="),
            theme.getLanguageSpecificStyle("python_global_variable")
        )
    )
}

class PythonDefaultTheme : SyntaxHighlightingTheme {
    override fun getKeywordStyle() = TextStyle(color = Color(0xff399bc5))
    override fun getStringStyle() = TextStyle(color = Color(0xff007a09))
    override fun getCommentStyle() = TextStyle(color = Color(0xFF888888), fontWeight = FontWeight.Light)
    override fun getNumbersStyle(): TextStyle = TextStyle(color = Color(0xff007a09))
    override fun getDefaultTextStyle(): TextStyle = TextStyle(color = Color(0xFFFFFFFF))

    private val languageSpecificStyles: Map<String, TextStyle> = mapOf(
        "python_class" to TextStyle(color = Color(0xFFA9E2F3), fontWeight = FontWeight.Bold),
        "python_function" to TextStyle(color = Color(0xFFF781F3)),
        "python_variable" to TextStyle(color = Color.DarkGray),
        "python_annotation" to TextStyle(color = Color(0xffc6a83b), fontWeight = FontWeight.Bold),
        "python_type" to TextStyle(color = Color.DarkGray, fontWeight = FontWeight.Bold),
        "python_constant" to TextStyle(color = Color(0xFFF5A9D0), fontWeight = FontWeight.Bold),
        "python_operator" to TextStyle(color = Color.DarkGray),
        "python_bracket" to TextStyle(color = Color.DarkGray),
        "python_parenthesis" to TextStyle(color = Color.DarkGray),
        "python_brace" to TextStyle(color = Color.DarkGray),
        "python_parameter" to TextStyle(color = Color(0xFFFD971F)),
        "python_local_variable" to TextStyle(color = Color(0xFF88CBFE)),
        "python_global_variable" to TextStyle(color = Color.Gray),
    )

    override fun getLanguageSpecificStyle(tokenType: String): TextStyle {
        return languageSpecificStyles[tokenType] ?: TextStyle(color = Color(0xFFFFFFFF))
    }
}
