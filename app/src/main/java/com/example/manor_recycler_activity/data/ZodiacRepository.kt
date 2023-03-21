package com.example.manor_recycler_activity.data

import androidx.lifecycle.LiveData

class ZodiacRepository(private val ZodiacDao: ZodiacDao) {

    val readAllData: LiveData<List<Zodiac>> = ZodiacDao.readAllData()

}