package com.taha.exposed_editor.lang.python

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import com.taha.exposed_editor.lang.BaseLanguageSyntax
import com.taha.exposed_editor.lang.SyntaxRule
import com.taha.exposed_editor.lang.SyntaxTheme


class PythonSyntax : BaseLanguageSyntax() {
    override val languageName: String = "Python"

    val darkTheme = SyntaxTheme(
        keywordColor = Color(0xFF569CD6),    // Blue
        numberColor = Color.Green,     //  green
        stringColor = Color(0xFFCE9178),     // Orange
        commentColor = Color(0xFF6A9955),    // Green
        defaultTextColor = Color(0xFFD4D4D4)  // Light gray
    )

    override val rules: List<SyntaxRule> = listOf(
        // Keywords
        *createKeywordRules(
            listOf(
                "import","def", "class", "if", "else", "elif", "while", "for",
                "in", "try", "except", "finally", "with", "as", "lambda",
                "return", "yield", "break", "continue", "pass", "raise"
            ),
            SpanStyle(color = darkTheme.keywordColor)
        ).toTypedArray(),

        // Numbers
        SyntaxRule(Regex("\\b\\d+\\b"), SpanStyle(color = darkTheme.numberColor)),

        // Strings
        SyntaxRule(Regex("(['\"])[^'\"]*\\1"), SpanStyle(color = darkTheme.stringColor)),

        // Comments
        SyntaxRule(Regex("#.*"), SpanStyle(color = darkTheme.commentColor))
    )
}