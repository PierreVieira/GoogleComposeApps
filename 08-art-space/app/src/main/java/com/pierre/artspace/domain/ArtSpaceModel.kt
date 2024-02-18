package com.pierre.artspace.domain

import androidx.annotation.DrawableRes
import com.pierre.artspace.R

enum class ArtSpaceModel(
    @DrawableRes val drawableId: Int,
    val title: String,
    val authorName: String,
    val year: Int,
) {
    CAMP(
        drawableId = R.drawable.camp,
        title = "Golden Harvest",
        authorName = "Julian Weber",
        year = 2023
    ),
    FRUITS(
        drawableId = R.drawable.fruits,
        title = "Autumn's Bounty",
        authorName = "Hannah Lee",
        year = 2021
    ),
    GRASS(
        drawableId = R.drawable.grass,
        title = "Whisper of the Forest",
        authorName = "MArcus O'Reilly",
        year = 2022
    ),
    LAKE(
        drawableId = R.drawable.lake,
        title = "Mirror of the Sky",
        authorName = "Elena Vasquez",
        year = 2024
    ),
}
