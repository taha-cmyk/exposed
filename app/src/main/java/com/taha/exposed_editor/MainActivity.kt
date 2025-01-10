package com.taha.exposed_editor

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.taha.exposed_editor.lang.LanguageSyntax
import com.taha.exposed_editor.lang.python.PythonSyntax
import com.taha.exposed_editor.ui.editor.SyntaxHighlightedTextField
import com.taha.exposed_editor.ui.theme.Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Theme {
            Surface(color = MaterialTheme.colorScheme.surface) {
                    App()
                }
            }

        }
    }
}


@Composable
fun CodeEditor(language: LanguageSyntax) {
    var code by remember { mutableStateOf("import matplotlib.pyplot as plt\n" +
            "import numpy as np\n" +
            "\n" +
            "y = np.array([35, 25, 25, 15])\n" +
            "mylabels = [\"Apples\", \"Bananas\", \"Cherries\", \"Dates\"]\n" +
            "\n" +
            "plt.pie(y, labels = mylabels, startangle = 90)\n" +
            "plt.show()") }

    SyntaxHighlightedTextField(
        value = code,
        onValueChange = { code = it },
        languageSyntax = language
    )
}

@Composable
fun App() {
    CodeEditor(PythonSyntax())
}


@Preview(name = "Light Mode")
@Preview(name = "Dark Mode", uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun DarkEditorPreview() {
    CodeEditor(PythonSyntax())
}