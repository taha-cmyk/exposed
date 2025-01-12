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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.taha.exposed_editor.lang.LanguageSyntax
import com.taha.exposed_editor.lang.SyntaxTheme
import com.taha.exposed_editor.lang.kotlin.KotlinSyntax
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
    var code by remember { mutableStateOf("package com.example.demo\n" +
            "\n" +
            "import kotlin.math.PI\n" +
            "import kotlinx.coroutines.*\n" +
            "\n" +
            "// This is a single-line comment\n" +
            "/* This is a\n" +
            "   multi-line comment */\n" +
            "\n" +
            "@Deprecated(\"Use newClass instead\")\n" +
            "data class Person(\n" +
            "    private val name: String,\n" +
            "    var age: Int = 0,\n" +
            "    val emails: List<String> = listOf()\n" +
            ") {\n" +
            "    companion object {\n" +
            "        const val MAX_AGE = 150\n" +
            "    }\n" +
            "\n" +
            "    init {\n" +
            "        require(age >= 0) { \"Age cannot be negative\" }\n" +
            "    }\n" +
            "\n" +
            "    fun isAdult(): Boolean = age >= 18\n" +
            "\n" +
            "    val isRetired: Boolean\n" +
            "        get() = age >= 65\n" +
            "}\n" +
            "\n" +
            "sealed interface Shape {\n" +
            "    fun area(): Double\n" +
            "}\n" +
            "\n" +
            "class Circle(private val radius: Double) : Shape {\n" +
            "    override fun area(): Double = PI * radius * radius\n" +
            "}\n" +
            "\n" +
            "suspend fun main() = coroutineScope {\n" +
            "    val person = Person(\"John Doe\", 25)\n" +
            "    val numbers = listOf(1, 2, 3, 0xFF, 0b1010)\n" +
            "    val text = \"\"\"\n" +
            "        Multi-line\n" +
            "        String with ${"interpolation"}\n" +
            "        And person.name\n" +
            "    \"\"\".trimIndent()\n" +
            "\n" +
            "    println(\"Hello, person.name!\")\n" +
            "\n" +
            "    val result = when {\n" +
            "        person.isAdult() -> \"Adult\"\n" +
            "        person.age < 0 -> throw IllegalArgumentException(\"Invalid age\")\n" +
            "        else -> \"Minor\"\n" +
            "    }\n" +
            "\n" +
            "    val doubled = numbers\n" +
            "        .filter { it > 0 }\n" +
            "        .map { it * 2 }\n" +
            "\n" +
            "    launch {\n" +
            "        try {\n" +
            "            delay(1000L)\n" +
            "            println(\"Delayed message\")\n" +
            "        } catch (e: Exception) {\n" +
            "            e.printStackTrace()\n" +
            "        } finally {\n" +
            "            println(\"Done\")\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    val circle = Circle(5.0)\n" +
            "    println(\"Circle area: circle.area()}\")\n" +
            "\n" +
            "    // Lambda example\n" +
            "    val sum = { x: Int, y: Int -> x + y }\n" +
            "    println(\"Sum: sum(10, 20)}\")\n" +
            "\n" +
            "    // Type inference and nullable types\n" +
            "    val nullableString: String? = null\n" +
            "    val length = nullableString?.length ?: 0\n" +
            "}\n" +
            "\n" +
            "// Extension function\n" +
            "fun String.addExclamation() = \"this!\"\n" +
            "\n" +
            "// Inline function with reified type parameter\n" +
            "inline fun <reified T> printType() {\n" +
            "    println(T::class.java.name)\n" +
            "}\n" +
            "\n" +
            "// Object declaration\n" +
            "object Singleton {\n" +
            "    val property = \"I'm a singleton\"\n" +
            "    fun doSomething() = println(property)\n" +
            "}\n" +
            "\n" +
            "// Enum class\n" +
            "enum class Direction {\n" +
            "    NORTH, SOUTH, EAST, WEST\n" +
            "}") }

    SyntaxHighlightedTextField(
        value = code,
        onValueChange = { code = it },
        languageSyntax = language
    )
}

@Composable
fun App() {
    val customTheme = SyntaxTheme(
        keywordColor = Color(0xFF569CD6),    // Color for keywords
        numberColor = Color(0xFFB5CEA8),     // Color for numbers
        stringColor = Color(0xFFCE9178),     // Color for strings
        commentColor = Color(0xFF6A9955),    // Color for comments
        defaultTextColor = Color(0xFFD4D4D4)  // Default text color
    )
    CodeEditor(PythonSyntax(customTheme))
}


@Preview(name = "Light Mode")
@Preview(name = "Dark Mode", uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun DarkEditorPreview() {
    val customTheme = SyntaxTheme(
        keywordColor = Color(0xFF569CD6),    // Color for keywords
        numberColor = Color(0xFFB5CEA8),     // Color for numbers
        stringColor = Color(0xFFCE9178),     // Color for strings
        commentColor = Color(0xFF6A9955),    // Color for comments
        defaultTextColor = Color(0xFFD4D4D4)  // Default text color
    )
    CodeEditor(KotlinSyntax(customTheme))
}