package com.pierre.artspace.presentation.screen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pierre.artspace.presentation.theme.ArtSpaceTheme

@Composable
fun DescriptionComponent(
    title: String,
    authorName: String,
    year: Int,
    modifier: Modifier = Modifier,
) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.secondaryContainer
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(
                text = title,
                fontSize = 24.sp,
                fontWeight = FontWeight.Light
            )
            Row {
                Text(
                    text = authorName,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = " (${year})",
                    fontWeight = FontWeight.Light
                )
            }
        }
    }
}

@Composable
@Preview
fun DescriptionComponentPreview() {
    ArtSpaceTheme {
        DescriptionComponent(
            title = "Camping to compose preview",
            authorName = "Pierre Vieira",
            year = 2021
        )
    }
}
