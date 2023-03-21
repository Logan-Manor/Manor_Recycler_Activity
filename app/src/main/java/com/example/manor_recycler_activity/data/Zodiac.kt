package com.example.manor_recycler_activity.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Zodiac")
data class Zodiac(
    @PrimaryKey(autoGenerate = true) val ID: Int,
    val Sign: String,
    val Description: String,
    val Symbol: String,
    val Month: String
)
