package com.underground.picprism.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.underground.picprism.data.remote.UnsplashApiService
import com.underground.picprism.utils.Constants
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

object AppModule {

    val contentType = "application/json".toMediaType()
    val json = Json { ignoreUnknownKeys = true }
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(json.asConverterFactory(contentType))
        .baseUrl(Constants.BASE_URL).build()

    val retrofitService : UnsplashApiService by lazy {
        retrofit.create(UnsplashApiService::class.java)

    }

}