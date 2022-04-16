package com.example.essailibrairie

abstract class Titulaire {
    lateinit var Nom : String
    lateinit var Prenom : String

    abstract var Id : Long

    abstract fun Emprunt_Livre(Livres)


}
}