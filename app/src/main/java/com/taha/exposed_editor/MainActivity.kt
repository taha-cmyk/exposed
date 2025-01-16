package com.taha.exposed_editor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.taha.exposed_editor.lang.kotlin.KotlinDefaultTheme
import com.taha.exposed_editor.ui.editor.SyntaxHighlightedTextField
import com.taha.exposed_editor.ui.theme.Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Theme {
            Surface(color = MaterialTheme.colorScheme.surface) {
                val theme = KotlinDefaultTheme()

                SyntaxHighlightedTextField(
                    code = """
                        fun main() {
                            val message = "Hello, World!" // This is a comment
                            println(message)
                        }
                    """.trimIndent(),
                    theme = theme,
                )
                }
            }

        }
    }
}

@Preview
@Composable
fun PreviewHighlightedCodeEditor() {
    val theme = KotlinDefaultTheme()

    SyntaxHighlightedTextField(
        code = """
            fun main() {
                val message = "Hello, World!" // This is a comment
                println(message)
            }
        """.trimIndent(),
        theme = theme,
    )
}
