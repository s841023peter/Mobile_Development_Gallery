package edu.vt.cs.cs5254.photogallerywalk

import androidx.lifecycle.ViewModel
import edu.vt.cs.cs5254.photogallerywalk.api.FlickrFetchr


class PhotoGalleryViewModel : ViewModel() {
    val galleryItemLiveData = FlickrFetchr().fetchPhotos()
}