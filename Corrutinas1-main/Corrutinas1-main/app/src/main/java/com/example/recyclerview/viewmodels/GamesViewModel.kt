package com.example.recyclerview.viewmodels

import androidx.lifecycle.ViewModel
import com.example.recyclerview.R
import com.example.recyclerview.models.Game

class GamesViewModel: ViewModel(){
    init {
        //constructor
    }
    fun getGameList(): ArrayList<Game>{
        val game: Game = Game("Estudiante", "chica", 12, R.drawable.female01)
        var gameList:ArrayList<Game> = ArrayList<Game>() //Lista vacia de juegos
        gameList.add(game)

        gameList.add(Game("Estudiante", "chico", 10, R.drawable.male01))
        gameList.add(Game("Youtuber", "chica", 14, R.drawable.female02))
        gameList.add(Game("Profesor", "chico", 24, R.drawable.male02))
        gameList.add(Game("Enfermera", "chica", 22, R.drawable.female03))
        gameList.add(Game("Pescador", "chico", 65, R.drawable.male03))
        gameList.add(Game("Mecánico", "chica", 21, R.drawable.female04))
        gameList.add(Game("Cocinero", "chico", 32, R.drawable.male04))


        ///
        return gameList //Regresamos la lista de juegos


    }

}