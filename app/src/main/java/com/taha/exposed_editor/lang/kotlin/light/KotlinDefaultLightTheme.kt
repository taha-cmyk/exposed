package com.taha.exposed_editor.lang.kotlin.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.taha.exposed_editor.lang.SyntaxHighlightingTheme


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