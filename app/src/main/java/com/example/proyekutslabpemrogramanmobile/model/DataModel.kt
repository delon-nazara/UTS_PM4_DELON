package com.example.proyekutslabpemrogramanmobile.model

import androidx.annotation.DrawableRes

data class DataModel(
    @DrawableRes val logoId: Int,
    val name: String,
    val creator: String,
    val yearReleased: String,
    val fileExtension: String,
    val useCases: String,
    val description: String
)
