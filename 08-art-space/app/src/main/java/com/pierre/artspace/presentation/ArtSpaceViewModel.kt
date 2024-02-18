package com.pierre.artspace.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.pierre.artspace.domain.ArtSpaceModel
import com.pierre.artspace.domain.GetArtSpacesUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class ArtSpaceViewModel(
    getArtSpaces: GetArtSpacesUseCase,
) : ViewModel() {

    private val artSpaces = getArtSpaces()
    private var currentIndex = 0
    private val _state = MutableStateFlow(artSpaces[currentIndex])
    val state: StateFlow<ArtSpaceModel> = _state

    fun onNextArt() {
        _state.update {
            updateCurrentIndexBasedOnNext()
            artSpaces[currentIndex]
        }
    }

    fun onPreviousArt() {
        _state.update {
            updateCurrentIndexBasedOnPrevious()
            artSpaces[currentIndex]
        }
    }

    private fun updateCurrentIndexBasedOnPrevious() {
        if (currentIndex == 0) {
            currentIndex = artSpaces.lastIndex
        } else {
            currentIndex--
        }
    }

    private fun updateCurrentIndexBasedOnNext() {
        if (artSpaces.lastIndex == currentIndex) {
            currentIndex = 0
        } else {
            currentIndex++
        }
    }

    companion object {
        val Factory : ViewModelProvider.Factory = viewModelFactory {
            initializer {
                ArtSpaceViewModel(GetArtSpacesUseCase())
            }
        }
    }
}
