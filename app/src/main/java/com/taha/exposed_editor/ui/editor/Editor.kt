package com.taha.exposed_editor.ui.editor

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.TransformedText
import com.taha.exposed_editor.lang.SyntaxHighlightingTheme
import com.taha.exposed_editor.lang.buildHighlightedCode


@Composable
fun SyntaxHighlightedTextField(
    code: String = "",
    theme: SyntaxHighlightingTheme,
    backgroundColor: Color = MaterialTheme.colorScheme.surface,
) {
    val isSystemInDarkTheme = isSystemInDarkTheme() // later use to change theme to dark mode

    var textFieldValue by remember { mutableStateOf(TextFieldValue(code)) }

    // Compute the highlighted code as the user types
    val highlightedText = buildHighlightedCode(textFieldValue.text, theme)

    // Render the BasicTextField with real-time highlighting
    BasicTextField(
        value = textFieldValue,
        onValueChange = { newValue -> textFieldValue = newValue },
        textStyle = TextStyle(fontFamily = FontFamily.Monospace),
        modifier = Modifier.fillMaxWidth().imePadding(),
        visualTransformation = { text ->
            TransformedText(
                text = highlightedText,
                OffsetMapping.Identity
            )
        },
        decorationBox = { innerTextField ->
            Row(
                Modifier
                    .background(backgroundColor).fillMaxSize()
            ) {
                innerTextField()
            }
        }
    )
}


