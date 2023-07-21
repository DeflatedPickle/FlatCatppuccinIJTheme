package com.deflatedpickle.flatlaf.intellijthemes

object FlatCatppuccinMochaIJTheme : CatppuccinTheme("mocha") {
    fun setup() = setup(FlatCatppuccinMochaIJTheme)
    fun installLafInfo() = installLafInfo(name, FlatCatppuccinMochaIJTheme::class.java)
    override fun getName() = "Catppuccin - Mocha"
}