package com.example.parcial2.models

import androidx.annotation.DrawableRes

data class Char (
    @DrawableRes val profilePic: Int,
    val age: Int,
    val sex: String,
    val hobby: String,
    )
