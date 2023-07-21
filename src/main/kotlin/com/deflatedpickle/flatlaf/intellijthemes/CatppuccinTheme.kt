package com.deflatedpickle.flatlaf.intellijthemes

import com.formdev.flatlaf.IntelliJTheme
import com.formdev.flatlaf.IntelliJTheme.ThemeLaf

open class CatppuccinTheme(theme: String) : ThemeLaf(
    IntelliJTheme(
        CatppuccinTheme::class.java.getResourceAsStream(
            "/$theme.theme.json"
        )
    )
)