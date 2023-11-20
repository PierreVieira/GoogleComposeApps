package com.example.lemonade.presentation.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.domain.UiState
import com.example.lemonade.presentation.screen.home.component.AppLabelComponent
import com.example.lemonade.presentation.ui.theme.ButtonBackground
import com.example.lemonade.presentation.ui.theme.LemonadeTheme

@Composable
fun HomeScreen(
    uiState: UiState,
    onClick: () -> Unit,
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            AppLabelComponent(modifier = Modifier.fillMaxWidth())
        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = onClick,
                shape = RoundedCornerShape(24.dp) ,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = ButtonBackground
                )
            ) {
                Image(
                    painter = painterResource(id = uiState.image),
                    contentDescription = stringResource(id = uiState.contentDescription),
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = stringResource(id = uiState.text),
                fontSize = 18.sp
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun HomeScreenPreview() {
    LemonadeTheme {
        HomeScreen(
            uiState = UiState.STEP_1,
            onClick = {},
        )
    }
}
