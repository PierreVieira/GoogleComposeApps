package com.pierre.artspace.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.pierre.artspace.presentation.screen.ArtSpaceScreen
import com.pierre.artspace.presentation.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {

    private val viewModel: ArtSpaceViewModel by viewModels {
        ArtSpaceViewModel.Factory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val model by viewModel.state.collectAsState()
                    ArtSpaceScreen(
                        model = model,
                        onPrevious = viewModel::onPreviousArt,
                        onNext = viewModel::onNextArt,
                    )
                }
            }
        }
    }
}
