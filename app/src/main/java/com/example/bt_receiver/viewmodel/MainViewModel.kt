package com.example.bt_receiver.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.bt_receiver.repository.MainRepository

class MainViewModel(application: Application): AndroidViewModel(application) {
    private val repository = MainRepository(application)

    fun playPause() {}
    fun previous() {}
    fun forward() {}
}