package com.example.manor_recycler_activity.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Zodiac :: class], version = 1, exportSchema = false)
abstract class ZodiacDatabase : RoomDatabase() {

    abstract fun ZodiacDao() : ZodiacDao

    companion object{

        @Volatile
        private var INSTANCE : ZodiacDatabase? = null

        fun getDatabase(context: Context): ZodiacDatabase {

            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ZodiacDatabase::class.java,
                    "ZodiacDatabase"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
