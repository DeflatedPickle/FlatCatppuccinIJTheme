@file:Suppress("SpellCheckingInspection", "unused")

package com.deflatedpickle.flatlaf.intellijthemes

class FlatCatppuccinFrappeIJTheme : CatppuccinTheme("frappe") {
    companion object {
        const val NAME = "Catppuccin - Frappe"
        fun setup() = setup(FlatCatppuccinFrappeIJTheme())
        fun installLafInfo() = installLafInfo(NAME, FlatCatppuccinFrappeIJTheme::class.java)
    }
    override fun getName() = NAME
}