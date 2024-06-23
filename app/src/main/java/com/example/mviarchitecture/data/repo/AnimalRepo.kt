package com.example.mviarchitecture.data.repo

import com.example.mviarchitecture.data.api.AnimalApi

class AnimalRepo(private val api: AnimalApi) {
    suspend fun getAnimals() = api.getAnimals()
}