package edu.vt.cs.cs5254.photogallerywalk.api

import com.google.gson.annotations.SerializedName


class PhotoResponse {
    @SerializedName("photo") lateinit var galleryItems: List<GalleryItem>
}