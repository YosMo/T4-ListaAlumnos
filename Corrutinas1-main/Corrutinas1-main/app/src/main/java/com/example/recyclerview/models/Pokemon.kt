package com.example.recyclerview.models

import androidx.annotation.DrawableRes

data class Pokemon(
    @DrawableRes val image: Int,
    val name: String

)