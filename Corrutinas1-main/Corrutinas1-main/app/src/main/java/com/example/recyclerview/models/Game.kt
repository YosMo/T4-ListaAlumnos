package com.example.recyclerview.models

import androidx.annotation.DrawableRes

data class Game (
    val profesion: String,
    val genero: String,
    val edad: Int,
    @DrawableRes val image: Int
)

