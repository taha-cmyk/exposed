package com.taha.exposed_editor.lang.ruby
import com.taha.exposed_editor.lang.SyntaxHighlightingTheme
import com.taha.exposed_editor.lang.ruby.dark.RubyDarkTheme
import com.taha.exposed_editor.lang.ruby.light.RubyDefaultTheme

enum class RubyThemes  {
    DEFAULT,
    DARK,
}

fun getRubyTheme(theme: RubyThemes) : SyntaxHighlightingTheme {
    return when (theme) {
        RubyThemes.DEFAULT -> RubyDefaultTheme()
        // not yet implemented
        RubyThemes.DARK -> RubyDarkTheme()
    }

}