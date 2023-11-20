package com.example.lemonade.domain

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.lemonade.R

enum class UiState(
    @StringRes val text: Int,
    @DrawableRes val image: Int,
    @StringRes val contentDescription: Int,
) {
    STEP_1(
        text = R.string.select_message,
        image = R.drawable.lemon_tree,
        contentDescription = R.string.lemon_tree
    ),
    STEP_2(
        text = R.string.keep_tapping_message,
        image = R.drawable.lemon_squeeze,
        contentDescription = R.string.lemon
    ),
    STEP_3(
        text = R.string.tap_lemonade_message,
        image = R.drawable.lemon_drink,
        contentDescription = R.string.glass_of_lemonade
    ),
    STEP_4(
        text = R.string.empty_glass,
        image = R.drawable.lemon_restart,
        contentDescription = R.string.empty_glass
    )
}
