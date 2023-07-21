@file:Suppress("SpellCheckingInspection", "unused")

package com.deflatedpickle.flatlaf.intellijthemes

object FlatCatppuccinMacchiatoIJTheme : CatppuccinTheme("macchiato") {
    fun setup() = setup(FlatCatppuccinMacchiatoIJTheme)
    fun installLafInfo() = installLafInfo(name, FlatCatppuccinMacchiatoIJTheme::class.java)
    override fun getName() = "Catppuccin - Macchiato"
}