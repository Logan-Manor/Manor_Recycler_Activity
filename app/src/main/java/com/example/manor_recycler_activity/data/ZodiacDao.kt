package com.example.manor_recycler_activity.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.manor_recycler_activity.data.Zodiac

@Dao
interface ZodiacDao {

    @Query("SELECT * FROM Zodiac ORDER BY ID ASC")
    fun readAllData(): LiveData<List<Zodiac>>
}