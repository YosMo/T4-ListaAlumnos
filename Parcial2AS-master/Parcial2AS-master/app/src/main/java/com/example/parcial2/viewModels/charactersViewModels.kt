package com.example.parcial2.viewModels

import com.example.parcial2.R
import com.example.parcial2.models.Char

class charactersViewModels {

    fun getCharList(): ArrayList<Char>{
        var charList: ArrayList<Char> = ArrayList<Char>()

        //Lista de personas
        charList.add(Char(R.drawable.female01, 12 , "Chica", "Estudiante" ))
        charList.add(Char(R.drawable.male01, 10, "Chico", "Estudiante"))
        charList.add(Char(R.drawable.female02, 14, "Chica", "Youtuber"))
        charList.add(Char(R.drawable.male02, 24, "Chico", "Profesor"))
        charList.add(Char(R.drawable.female03, 22, "Chica", "Enfermera"))
        charList.add(Char(R.drawable.male03, 65, "Chico", "Pescador"))
        charList.add(Char(R.drawable.female04, 21, "Chica", "Mecánico"))
        charList.add(Char(R.drawable.male04, 32, "Chico", "Cocinero"))

        return charList
    }
}