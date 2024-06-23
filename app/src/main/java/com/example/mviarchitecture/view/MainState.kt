package com.example.mviarchitecture.view

import com.example.mviarchitecture.data.model.Animal

sealed class MainState {
    object Idle:MainState()
    object Loading:MainState()
    data class Animals(val animal: List<Animal>):MainState()
    data class Error(val error:String?):MainState()
}