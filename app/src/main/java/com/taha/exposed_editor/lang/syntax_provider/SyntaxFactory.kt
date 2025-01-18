package com.taha.exposed_editor.lang.syntax_provider

import com.taha.exposed_editor.lang.SyntaxHighlightingTheme
import com.taha.exposed_editor.lang.SyntaxPattern
import com.taha.exposed_editor.lang.javascript.JavaScriptDefaultTheme
import com.taha.exposed_editor.lang.javascript.getJavaScriptSyntaxPatterns
import com.taha.exposed_editor.lang.kotlin.getKotlinSyntaxPatterns
import com.taha.exposed_editor.lang.kotlin.light.KotlinDefaultTheme
import com.taha.exposed_editor.lang.python.PythonDefaultTheme
import com.taha.exposed_editor.lang.python.getPythonSyntaxPatterns
import com.taha.exposed_editor.lang.ruby.getRubySyntaxPatterns
import com.taha.exposed_editor.lang.ruby.light.RubyDefaultTheme


object SyntaxProvider {


    fun getSyntaxPatterns(language: Language, theme: SyntaxHighlightingTheme): List<SyntaxPattern> {
        return when (language) {
            Language.KOTLIN -> getKotlinSyntaxPatterns(theme)
            Language.PYTHON -> getPythonSyntaxPatterns(theme)
            Language.RUBY -> getRubySyntaxPatterns(theme)
            Language.JAVASCRIPT -> getJavaScriptSyntaxPatterns(theme)
        }
    }


    fun getDefaultTheme(language: Language): SyntaxHighlightingTheme {
        return when (language) {
            Language.KOTLIN -> KotlinDefaultTheme()
            Language.PYTHON -> PythonDefaultTheme()
            Language.RUBY -> RubyDefaultTheme()
            Language.JAVASCRIPT -> JavaScriptDefaultTheme()
        }
    }
}

enum class Language {
    KOTLIN,
    PYTHON,
    RUBY,
    JAVASCRIPT
}