package com.taha.exposed_editor.lang.kotlin

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
