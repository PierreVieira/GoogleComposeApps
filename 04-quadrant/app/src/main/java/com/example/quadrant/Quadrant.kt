package com.example.quadrant

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrant.ui.theme.QuadrantTheme

@Composable
fun Quadrant(
    modifier: Modifier = Modifier,
    quadrantConfiguration: QuadrantConfiguration,
) {
    Surface(
        modifier = modifier,
        color = Color(quadrantConfiguration.colorCode)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(id = quadrantConfiguration.title),
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = stringResource(id = quadrantConfiguration.text),
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun QuadrantPreview() {
    QuadrantTheme {
        Quadrant(
            quadrantConfiguration = QuadrantConfiguration.FIRST
        )
    }
}
