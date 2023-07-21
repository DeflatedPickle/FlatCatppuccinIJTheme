@file:Suppress("SpellCheckingInspection", "unused")

package com.deflatedpickle.flatlaf.intellijthemes

object FlatCatppuccinFrappeIJTheme : CatppuccinTheme("frappe") {
    fun setup() = setup(FlatCatppuccinFrappeIJTheme)
    fun installLafInfo() = installLafInfo(name, FlatCatppuccinFrappeIJTheme::class.java)
    override fun getName() = "Catppuccin - Frappe"
}