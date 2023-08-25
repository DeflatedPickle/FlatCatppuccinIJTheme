@file:Suppress("SpellCheckingInspection", "unused")

package com.deflatedpickle.flatlaf.intellijthemes

class FlatCatppuccinMacchiatoIJTheme : CatppuccinTheme("macchiato") {
    companion object {
        const val NAME = "Catppuccin - Macchiato"

        fun setup() = setup(FlatCatppuccinMacchiatoIJTheme())
        fun installLafInfo() = installLafInfo(NAME, FlatCatppuccinMacchiatoIJTheme::class.java)
    }

    override fun getName() = NAME
}