package com.pierre.artspace.presentation.screen

import android.app.Activity
import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowHeightSizeClass
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pierre.artspace.domain.ArtSpaceModel
import com.pierre.artspace.presentation.screen.components.ButtonsRow
import com.pierre.artspace.presentation.screen.components.DescriptionComponent
import com.pierre.artspace.presentation.screen.components.ImageCardComponent
import com.pierre.artspace.presentation.theme.ArtSpaceTheme

@Composable
fun ArtSpaceScreen(
    model: ArtSpaceModel,
    onPrevious: () -> Unit,
    onNext: () -> Unit,
) {
    val modifier = Modifier.fillMaxSize().padding(16.dp)
    val configuration = LocalConfiguration.current
    model.run {
        if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            LandscapeComponent(
                onPrevious = onPrevious,
                onNext = onNext,
                modifier = modifier
            )
        } else {
            PortraitComponent(
                onPrevious = onPrevious,
                onNext = onNext,
                modifier = modifier
            )
        }
    }
}

@Composable
private fun ArtSpaceModel.PortraitComponent(
    onPrevious: () -> Unit,
    onNext: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        ImageCardComponent(
            modifier = Modifier.fillMaxWidth(),
            drawableId = drawableId
        )
        Column {
            DescriptionComponent(
                modifier = Modifier.fillMaxWidth(),
                title = title,
                authorName = authorName,
                year = year
            )
            Spacer(modifier = Modifier.size(16.dp))
            ButtonsRow(
                modifier = Modifier.fillMaxWidth(),
                onPrevious = onPrevious,
                onNext = onNext
            )
        }
    }
}

@Composable
fun ArtSpaceModel.LandscapeComponent(
    onPrevious: () -> Unit,
    onNext: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        ImageCardComponent(
            modifier = Modifier.fillMaxHeight(),
            drawableId = drawableId
        )
        Spacer(modifier = Modifier.size(16.dp))
        Column(
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.Center
        ) {
            DescriptionComponent(
                modifier = Modifier.fillMaxWidth(),
                title = title,
                authorName = authorName,
                year = year
            )
            Spacer(modifier = Modifier.size(16.dp))
            ButtonsRow(
                modifier = Modifier.fillMaxWidth(),
                onPrevious = onPrevious,
                onNext = onNext
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ArtSpaceScreenPreview() {
    ArtSpaceTheme {
        ArtSpaceScreen(
            model = ArtSpaceModel.GRASS,
            onPrevious = {},
            onNext = {},
        )
    }
}
