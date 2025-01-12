package com.taha.exposed_editor.lang.kotlin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import com.taha.exposed_editor.lang.BaseLanguageSyntax
import com.taha.exposed_editor.lang.SyntaxRule
import com.taha.exposed_editor.lang.SyntaxTheme


class KotlinSyntax(override val theme: SyntaxTheme) : BaseLanguageSyntax() {
    override val languageName: String = "Kotlin"

    override val rules: List<SyntaxRule> = listOf(
        // Keywords
        *createKeywordRules(
            listOf(
                "fun", "val", "var", "class", "object", "interface",
                "private", "public", "protected", "internal",
                "if", "else", "when", "while", "for", "do", "return"
            ),
            SpanStyle(color = Color.Blue)
        ).toTypedArray(),

        // Numbers
        SyntaxRule(Regex("\\b\\d+\\b"), SpanStyle(color = Color.Magenta)),

        // Strings
        SyntaxRule(Regex("\"[^\"]*\""), SpanStyle(color = Color.Green)),

        // Comments
        SyntaxRule(Regex("//.*|/\\*[\\s\\S]*?\\*/"), SpanStyle(color = Color.Gray))
    )
}