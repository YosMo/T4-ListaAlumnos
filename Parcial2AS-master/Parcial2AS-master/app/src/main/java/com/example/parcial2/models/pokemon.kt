package com.example.parcial2.models

import androidx.annotation.DrawableRes

data class Pokemon (
    @DrawableRes val profilePic: Int,
    val name: String,
)