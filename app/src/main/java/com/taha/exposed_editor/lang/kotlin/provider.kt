package com.taha.exposed_editor.lang.kotlin

import com.taha.exposed_editor.lang.kotlin.light.KotlinDefaultTheme

enum class KotlinThemes  {
    DEFAULT,
    DRACULA,
}

fun getKotlinTheme(theme: KotlinThemes) {
    when (theme) {
        KotlinThemes.DEFAULT -> KotlinDefaultTheme()
        // not yet implemented
        KotlinThemes.DRACULA -> TODO()
    }
}
