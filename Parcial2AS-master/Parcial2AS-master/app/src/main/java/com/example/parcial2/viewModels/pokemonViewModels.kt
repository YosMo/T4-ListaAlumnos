package com.example.parcial2.viewModels
import com.example.parcial2.R
import com.example.parcial2.models.Pokemon

class pokemonViewModels {

    fun getCharList(): ArrayList<Pokemon>{
        var pokemonList: ArrayList<Pokemon> = ArrayList<Pokemon>()

        //Lista de pokemones
        pokemonList.add(Pokemon(R.drawable.pokemon01, "Sprigatito"))
        pokemonList.add(Pokemon(R.drawable.pokemon02, "Fuecoco"))
        pokemonList.add(Pokemon(R.drawable.pokemon03, "Quaxly"))

        return pokemonList
    }
}
