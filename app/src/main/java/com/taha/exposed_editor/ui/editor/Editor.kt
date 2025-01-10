package com.taha.exposed_editor.ui.editor

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import com.taha.exposed_editor.lang.LanguageSyntax
import com.taha.exposed_editor.lang.highlightSyntax

@Composable
fun SyntaxHighlightedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    languageSyntax: LanguageSyntax,
    customBackgroundColor: Color? = null,
    customTextColor: Color? = null,
    customCursorColor: Color? = null,
    modifier: Modifier = Modifier
) {
    val isSystemInDarkTheme = isSystemInDarkTheme()

    val backgroundColor = customBackgroundColor ?: if (isSystemInDarkTheme) {
        Color.Black
    } else {
        Color.White
    }

    val textColor = customTextColor ?: if (isSystemInDarkTheme) {
        Color.White
    } else {
        Color.Black
    }

    val cursorColor = customCursorColor ?: if (isSystemInDarkTheme) {
        Color.White
    } else {
        Color.Black
    }

    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        visualTransformation = { text ->
            TransformedText(
                text.highlightSyntax(languageSyntax),
                OffsetMapping.Identity
            )
        },
        textStyle = TextStyle(color = textColor),
        cursorBrush = SolidColor(cursorColor),
        modifier = modifier
            .background(backgroundColor)
            .fillMaxSize(),
        decorationBox = { innerTextField ->
            Row(
                Modifier
                    .background(backgroundColor, RoundedCornerShape(percent = 0))
            ) {
                innerTextField()
            }
        }
    )
}


