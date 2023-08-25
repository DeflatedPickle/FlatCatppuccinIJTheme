@file:Suppress("SpellCheckingInspection", "unused")

package com.deflatedpickle.flatlaf.intellijthemes

class FlatCatppuccinMochaIJTheme : CatppuccinTheme("mocha") {
    companion object {
        const val NAME = "Catppuccin - Mocha"

        fun setup() = setup(FlatCatppuccinMochaIJTheme())
        fun installLafInfo() = installLafInfo(NAME, FlatCatppuccinMochaIJTheme::class.java)
    }

    override fun getName() = NAME
}