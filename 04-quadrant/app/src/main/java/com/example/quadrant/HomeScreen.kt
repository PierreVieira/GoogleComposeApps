package com.example.quadrant

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.quadrant.ui.theme.QuadrantTheme

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        FirstRow()
        SecondRow()
    }
}

@Composable
private fun FirstRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.5f),
    ) {
        Quadrant(
            quadrantConfiguration = QuadrantConfiguration.FIRST,
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight()
        )
        Quadrant(
            quadrantConfiguration = QuadrantConfiguration.SECOND,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Composable
private fun SecondRow() {
    Row(
        modifier = Modifier.fillMaxSize()
    ) {
        Quadrant(
            quadrantConfiguration = QuadrantConfiguration.THIRD,
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight()
        )
        Quadrant(
            quadrantConfiguration = QuadrantConfiguration.FOURTH,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    QuadrantTheme {
        HomeScreen()
    }
}
