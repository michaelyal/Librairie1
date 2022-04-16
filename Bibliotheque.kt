package com.example.essailibrairie

import android.provider.Settings.Global.getString

class Bibliotheque {
    var Titulaires = ArrayList<Titulaire>()
    var Livres = ArrayList<Livre>()

    val book : String = getString(R.string.Livres)

    fun createBook{}


    }