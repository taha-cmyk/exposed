package com.taha.exposed_editor.lang.javascript

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.taha.exposed_editor.lang.SyntaxHighlightingTheme
import com.taha.exposed_editor.lang.SyntaxPattern

fun getJavaScriptSyntaxPatterns(theme: SyntaxHighlightingTheme): List<SyntaxPattern> {
    return listOf(
        // Keywords
        SyntaxPattern(
            Regex("\\b(function|let|const|var|if|else|for|while|do|switch|case|break|continue|return|try|catch|finally|throw|new|this|class|extends|super|import|export|default|typeof|instanceof|void|delete|in|of|async|await|yield|true|false|null|undefined)\\b"),
            theme.getKeywordStyle()
        ),
        // Strings
        SyntaxPattern(
            Regex("(\"\"\".*?\"\"\"|\"[^\"]*\"|'[^']*')", RegexOption.DOT_MATCHES_ALL),
            theme.getStringStyle()
        ),
        // Template literals
        SyntaxPattern(
            Regex("`.*?`", RegexOption.DOT_MATCHES_ALL),
            theme.getStringStyle()
        ),
        // Numbers
        SyntaxPattern(Regex("\\b([0-9]+(\\.[0-9]+)?|0x[0-9a-fA-F]+)\\b"), theme.getNumbersStyle()),
        // Single-line comments
        SyntaxPattern(Regex("//.*"), theme.getCommentStyle()),
        // Multi-line comments
        SyntaxPattern(
            Regex("/\\*[\\s\\S]*?\\*/", RegexOption.DOT_MATCHES_ALL),
            theme.getCommentStyle()
        ),
        // Class definitions
        SyntaxPattern(
            Regex("\\bclass\\s+(\\w+)"),
            theme.getLanguageSpecificStyle("javascript_class")
        ),
        // Function declarations
        SyntaxPattern(
            Regex("\\bfunction\\s+(\\w+)\\s*\\("),
            theme.getLanguageSpecificStyle("javascript_function")
        ),
        // Arrow functions
        SyntaxPattern(
            Regex("\\b(\\w+)\\s*=>"),
            theme.getLanguageSpecificStyle("javascript_arrow_function")
        ),
        // Variables (let, const, var)
        SyntaxPattern(
            Regex("\\b(let|const|var)\\s+(\\w+)\\s*="),
            theme.getLanguageSpecificStyle("javascript_variable")
        ),
        // Constants (UPPER_CASE naming convention)
        SyntaxPattern(
            Regex("\\b[A-Z_][A-Z0-9_]+\\b"),
            theme.getLanguageSpecificStyle("javascript_constant")
        ),
        // Operators
        SyntaxPattern(
            Regex("[+\\-*/=%&|^~<>!?]+"),
            theme.getLanguageSpecificStyle("javascript_operator")
        ),
        // Brackets, parentheses, and braces
        SyntaxPattern(
            Regex("[\\[\\]]"),
            theme.getLanguageSpecificStyle("javascript_bracket")
        ),
        SyntaxPattern(
            Regex("[()]"),
            theme.getLanguageSpecificStyle("javascript_parenthesis")
        ),
        SyntaxPattern(
            Regex("[{}]"),
            theme.getLanguageSpecificStyle("javascript_brace")
        ),
        // Function parameters
        SyntaxPattern(
            Regex("\\((\\s*\\w+\\s*:)"),
            theme.getLanguageSpecificStyle("javascript_parameter")
        ),
        // Object properties
        SyntaxPattern(
            Regex("\\.(\\w+)"),
            theme.getLanguageSpecificStyle("javascript_property")
        ),
        // Template literal placeholders
        SyntaxPattern(
            Regex("\\$\\{[^}]*\\}"),
            theme.getLanguageSpecificStyle("javascript_template_placeholder")
        )
    )
}

class JavaScriptDefaultTheme : SyntaxHighlightingTheme {
    override fun getKeywordStyle() = TextStyle(color = Color(0xFFCC7832)) // Orange (Darcula-like)
    override fun getStringStyle() = TextStyle(color = Color(0xFF6A8759)) // Green (Darcula-like)
    override fun getCommentStyle() = TextStyle(color = Color(0xFF808080)) // Gray (Darcula-like)
    override fun getNumbersStyle(): TextStyle = TextStyle(color = Color(0xFF6897BB)) // Blue (Darcula-like)
    override fun getDefaultTextStyle(): TextStyle = TextStyle(color = Color(0xFFA9B7C6)) // Light gray (Darcula-like)

    private val languageSpecificStyles: Map<String, TextStyle> = mapOf(
        "javascript_class" to TextStyle(color = Color(0xFFA9B7C6), fontWeight = FontWeight.Bold), // Light gray
        "javascript_function" to TextStyle(color = Color(0xFFFFC66D)), // Yellow (Darcula-like)
        "javascript_arrow_function" to TextStyle(color = Color(0xFFFFC66D)), // Yellow (Darcula-like)
        "javascript_variable" to TextStyle(color = Color(0xFFA9B7C6)), // Light gray
        "javascript_constant" to TextStyle(color = Color(0xFF9876AA)), // Purple (Darcula-like)
        "javascript_operator" to TextStyle(color = Color(0xFFA9B7C6)), // Light gray
        "javascript_bracket" to TextStyle(color = Color(0xFFA9B7C6)), // Light gray
        "javascript_parenthesis" to TextStyle(color = Color(0xFFA9B7C6)), // Light gray
        "javascript_brace" to TextStyle(color = Color(0xFFA9B7C6)), // Light gray
        "javascript_parameter" to TextStyle(color = Color(0xFFA9B7C6)), // Light gray
        "javascript_property" to TextStyle(color = Color(0xFF9876AA)), // Purple (Darcula-like)
        "javascript_template_placeholder" to TextStyle(color = Color(0xFF6897BB)) // Blue (Darcula-like)
    )

    override fun getLanguageSpecificStyle(tokenType: String): TextStyle {
        return languageSpecificStyles[tokenType] ?: TextStyle(color = Color(0xFFA9B7C6)) // Fallback to light gray
    }
}