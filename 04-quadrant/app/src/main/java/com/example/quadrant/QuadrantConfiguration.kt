package com.example.quadrant

import androidx.annotation.StringRes

enum class QuadrantConfiguration(
    val colorCode: Long,
    @StringRes val title: Int,
    @StringRes val text: Int,
) {
    FIRST(
        colorCode = 0xFFEADDFF,
        title = R.string.first_quadrant_title,
        text = R.string.first_quadrant_text
    ),
    SECOND(
        colorCode = 0xFFD0BCFF,
        title = R.string.second_quadrant_title,
        text = R.string.second_quadrant_text
    ),
    THIRD(
        colorCode = 0xFFB69DF8,
        title = R.string.third_quadrant_title,
        text = R.string.third_quadrant_text
    ),
    FOURTH(
        colorCode = 0xFFF6EDFF,
        title = R.string.fourth_quadrant_title,
        text = R.string.fourth_quadrant_text
    ),
}
