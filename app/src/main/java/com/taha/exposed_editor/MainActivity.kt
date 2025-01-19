package com.taha.exposed_editor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.taha.exposed_editor.lang.ruby.RubyThemes
import com.taha.exposed_editor.lang.ruby.dark.RubyDarkTheme
import com.taha.exposed_editor.lang.ruby.getRubySyntaxPatterns
import com.taha.exposed_editor.lang.ruby.getRubyTheme
import com.taha.exposed_editor.lang.syntax_provider.Language
import com.taha.exposed_editor.lang.syntax_provider.SyntaxProvider
import com.taha.exposed_editor.ui.editor.SyntaxHighlightedTextField
import com.taha.exposed_editor.ui.theme.Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Theme {
            Surface(color = MaterialTheme.colorScheme.surface) {
                val patterns = SyntaxProvider.getSyntaxPatterns(Language.RUBY,getRubyTheme(RubyThemes.DEFAULT))

                SyntaxHighlightedTextField(
                    code = """                                 
                    """.trimIndent(),
                    patterns = patterns
                )
                }
            }

        }
    }
}

@Preview
@Composable
fun PreviewHighlightedCodeEditor() {
    val patterns = SyntaxProvider.getSyntaxPatterns(Language.RUBY,getRubyTheme(RubyThemes.DEFAULT))

    SyntaxHighlightedTextField(
        code = """
# The Greeter class
class Greeter
  def initialize(name)
    @name = name.capitalize
  end

  def salute
    puts "Hello #{@name}!"
  end
end

# Create a new object
g = Greeter.new("world")

# Output "Hello World!"
g.salute
        """.trimIndent(),
        patterns = patterns
    )
    }
}
