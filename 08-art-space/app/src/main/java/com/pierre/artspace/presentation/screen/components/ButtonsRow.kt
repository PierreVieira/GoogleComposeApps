package com.pierre.artspace.presentation.screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pierre.artspace.presentation.theme.ArtSpaceTheme

@Composable
fun ButtonsRow(
    onPrevious: () -> Unit,
    onNext: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(onClick = onPrevious) {
            Text(text = "Previous")
        }
        Button(onClick = onNext) {
            Text(text = "Next")
        }
    }
}

@Preview
@Composable
fun ButtonsRowPreview() {
    ArtSpaceTheme {
        ButtonsRow(
            onPrevious = {},
            onNext = {}
        )
    }
}
