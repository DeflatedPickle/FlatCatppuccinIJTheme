@file:Suppress("SpellCheckingInspection", "unused")

package com.deflatedpickle.flatlaf.intellijthemes

object FlatCatppuccinLatteIJTheme : CatppuccinTheme("latte") {
    fun setup() = setup(FlatCatppuccinLatteIJTheme)
    fun installLafInfo() = installLafInfo(name, FlatCatppuccinLatteIJTheme::class.java)
    override fun getName() = "Catppuccin - Latte"
}