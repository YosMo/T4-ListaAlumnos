package com.example.recyclerview.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.recyclerview.models.Game
import com.example.recyclerview.models.Pokemon

@Composable
fun CardPokemon(pokemon: Pokemon){
    Card(modifier = Modifier.padding(8.dp)){
        Column(modifier = Modifier.fillMaxWidth()){
            Image(modifier = Modifier
                .height(190.dp)
                .width(20.dp)
                , painter = painterResource(id = pokemon.image)3
                , contentDescription = "vacio"
                , contentScale = ContentScale.Crop)

            Spacer(modifier = Modifier.width(10.dp))

            Text(text = pokemon.name,
                modifier = Modifier.padding(top=8.dp),
                color= Color(0xFF000000)
            )







        }
        //Imagen

        //Nombre

        //Consola y Juego

        //Button

    }
}