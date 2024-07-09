package com.underground.picprism.presentation.Home_Screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.underground.picprism.data.mapper.toDomainModelList
import com.underground.picprism.di.AppModule
import com.underground.picprism.domain.model.UnsplashImageModel
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    var images: List<UnsplashImageModel> by mutableStateOf(emptyList())
        private set

    init {
        getImages()
    }

    private fun getImages() {
        viewModelScope.launch {
            val result = AppModule.retrofitService.getEditorialFeedImages()
            images = result.toDomainModelList()
        }
    }
}