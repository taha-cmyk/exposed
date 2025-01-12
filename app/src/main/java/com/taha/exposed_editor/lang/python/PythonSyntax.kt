package com.taha.exposed_editor.lang.python

import androidx.compose.ui.text.SpanStyle
import com.taha.exposed_editor.lang.BaseLanguageSyntax
import com.taha.exposed_editor.lang.SyntaxRule
import com.taha.exposed_editor.lang.SyntaxTheme


class PythonSyntax(override val theme: SyntaxTheme) : BaseLanguageSyntax() {
    override val languageName: String = "Python"


    override val rules: List<SyntaxRule> = listOf(
        // Keywords
        *createKeywordRules(
            listOf(
                "import","def", "class", "if", "else", "elif", "while", "for",
                "in", "try", "except", "finally", "with", "as", "lambda",
                "return", "yield", "break", "continue", "pass", "raise"
            ),
            SpanStyle(color = theme.keywordColor)
        ).toTypedArray(),

        // Numbers
        SyntaxRule(Regex("\\b\\d+\\b"), SpanStyle(color = theme.numberColor)),

        // Strings
        SyntaxRule(Regex("(['\"])[^'\"]*\\1"), SpanStyle(color = theme.stringColor)),

        // Comments
        SyntaxRule(Regex("#.*"), SpanStyle(color = theme.commentColor))
    )
}