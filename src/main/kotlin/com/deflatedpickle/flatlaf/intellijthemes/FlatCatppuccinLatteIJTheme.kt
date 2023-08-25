@file:Suppress("SpellCheckingInspection", "unused")

package com.deflatedpickle.flatlaf.intellijthemes

class FlatCatppuccinLatteIJTheme : CatppuccinTheme("latte") {
    companion object {
        const val NAME = "Catppuccin - Latte"
        fun setup() = setup(FlatCatppuccinLatteIJTheme())
        fun installLafInfo() = installLafInfo(NAME, FlatCatppuccinLatteIJTheme::class.java)
    }

    override fun getName() = NAME
}