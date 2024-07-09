package com.underground.picprism.data.mapper

import com.underground.picprism.data.remote.dto.UnsplashImageDto
import com.underground.picprism.domain.model.UnsplashImageModel

fun UnsplashImageDto.toDomainModel(): UnsplashImageModel {
    return UnsplashImageModel(
        id = this.id,
        imageUrlSmall = this.urls.small,
        imageUrlRegular = this.urls.regular,
        imageUrlRaw = this.urls.raw,
        photographerName = this.user.name,
        photographerUsername = this.user.username,
        photographerProfileImgUrl = this.user.profileImage.small,
        photographerProfileLink = this.user.links.html,
        width = this.width,
        height = this.height,
        description = description
    )
}

fun List<UnsplashImageDto>.toDomainModelList(): List<UnsplashImageModel> {
    return this.map { it.toDomainModel() }
}