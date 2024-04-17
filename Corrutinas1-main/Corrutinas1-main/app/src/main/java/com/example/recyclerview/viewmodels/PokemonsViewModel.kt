package com.example.recyclerview.viewmodels

import androidx.lifecycle.ViewModel
import com.example.recyclerview.R
import com.example.recyclerview.models.Game
import com.example.recyclerview.models.Pokemon

class PokemonsViewModel: ViewModel(){
    init {
        //constructor
    }
    fun getPokemonList(): ArrayList<Pokemon>{
        val pokemon: Pokemon = Pokemon(R.drawable.pokemon01,"POKEMON1")
        var pokemonList:ArrayList<Pokemon> = ArrayList<Pokemon>() //Lista vacia de juegos
        pokemonList.add(pokemon)

        pokemonList.add(Pokemon(R.drawable.pokemon01,"POKEMON1"))
        pokemonList.add(Pokemon(R.drawable.pokemon02,"POKEMON2"))
        pokemonList.add(Pokemon(R.drawable.pokemon03,"POKEMON3"))


        ///
        return pokemonList


    }

}