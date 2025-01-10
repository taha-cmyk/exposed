package com.taha.exposed_editor.lang

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString


data class SyntaxRule(
    val pattern: Regex,
    val style: SpanStyle
)

interface LanguageSyntax {
    val rules: List<SyntaxRule>
    val languageName: String
}

abstract class BaseLanguageSyntax : LanguageSyntax {
    protected fun createKeywordRules(keywords: List<String>, style: SpanStyle): List<SyntaxRule> {
        return keywords.map { keyword ->
            SyntaxRule(Regex("\\b$keyword\\b"), style)
        }
    }
}

class SyntaxHighlighter(private val languageSyntax: LanguageSyntax) {
    fun highlight(text: String): AnnotatedString = buildAnnotatedString {
        append(text)

        languageSyntax.rules.forEach { rule ->
            rule.pattern.findAll(text).forEach { match ->
                addStyle(
                    rule.style,
                    match.range.first,
                    match.range.last + 1
                )
            }
        }
    }
}

fun AnnotatedString.highlightSyntax(languageSyntax: LanguageSyntax): AnnotatedString {
    return SyntaxHighlighter(languageSyntax).highlight(this.toString())
}


data class SyntaxTheme(
    val keywordColor: Color,
    val numberColor: Color,
    val stringColor: Color,
    val commentColor: Color,
    val defaultTextColor: Color
)

