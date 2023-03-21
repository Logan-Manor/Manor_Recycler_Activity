package com.example.manor_recycler_activity.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class ZodiacViewModel(application: Application): AndroidViewModel(application) {

    private val readAllData: LiveData<List<Zodiac>>
    private val repository: ZodiacRepository

    init {
        val ZodiacDao = ZodiacDatabase.getDatabase(application).ZodiacDao()
        repository = ZodiacRepository(ZodiacDao)
        readAllData = repository.readAllData
    }




}