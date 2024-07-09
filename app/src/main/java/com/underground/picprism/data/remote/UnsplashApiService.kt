package com.underground.picprism.data.remote

import com.underground.picprism.data.remote.dto.UnsplashImageDto
import com.underground.picprism.utils.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Headers


interface UnsplashApiService {


    @Headers("Authorization: Client-ID $API_KEY")
    @GET("/photos")
    suspend fun getEditorialFeedImages() : List<UnsplashImageDto>






}