package com.example.mviarchitecture.data.api

import com.example.mviarchitecture.data.model.Animal
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object AnimalService {
    const val BASE_URL = "https://raw.githubusercontent.com/CatalinStefan/animalApi/master/"

    private fun getRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api: AnimalApi = getRetrofit().create(AnimalApi::class.java)
}

interface AnimalApi {

    @GET("animals.json")
    suspend fun getAnimals(): List<Animal>

}