package com.example.lemonade.presentation.screen.home

import androidx.lifecycle.ViewModel
import com.example.lemonade.domain.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel : ViewModel() {

    private val _state = MutableStateFlow(UiState.STEP_1)
    val state: StateFlow<UiState> = _state
    var stepTwoClicksNeeded = getRandomNumber()
    var stepTwoClicksCurrent = 0

    fun onTap() {
        when (_state.value) {
            UiState.STEP_1 -> {
                _state.value = UiState.STEP_2
            }
            UiState.STEP_2 -> {
                stepTwoClicksCurrent++
                if (stepTwoClicksCurrent == stepTwoClicksNeeded) {
                    stepTwoClicksCurrent = 0
                    stepTwoClicksNeeded = getRandomNumber()
                    _state.value = UiState.STEP_3
                }
            }
            UiState.STEP_3 -> {
                _state.value = UiState.STEP_4
            }
            UiState.STEP_4 -> {
                _state.value = UiState.STEP_1
            }
        }
    }

    private fun getRandomNumber() : Int = (2..4).random()
}
