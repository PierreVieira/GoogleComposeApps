package com.pierre.artspace.presentation.screen.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pierre.artspace.R

@Composable
fun ImageCardComponent(
    modifier: Modifier = Modifier,
    @DrawableRes drawableId: Int,
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center,
    ) {
        Card(
            shape = RectangleShape,
            elevation = CardDefaults.cardElevation(
                defaultElevation = 16.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.background
            ),
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(32.dp)
            ) {
                Image(
                    modifier = Modifier.align(Alignment.Center),
                    painter = painterResource(drawableId),
                    contentDescription = null
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ImageCardComponentPreview() {
    ImageCardComponent(
        drawableId = R.drawable.camp
    )
}
