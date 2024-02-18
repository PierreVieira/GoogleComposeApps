package com.pierre.artspace.domain

import kotlin.random.Random

class GetArtSpacesUseCase {
    operator fun invoke(): List<ArtSpaceModel> = ArtSpaceModel
        .entries
        .shuffled(Random)
}
