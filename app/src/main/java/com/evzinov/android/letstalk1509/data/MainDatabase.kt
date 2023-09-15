package com.evzinov.android.letstalk1509.data


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [User::class], version = 1)
abstract class MainDatabase : RoomDatabase() {

abstract fun getDao(): UserDao


    companion object {
        fun getDb(context: Context): MainDatabase{
            return Room.databaseBuilder(
                context.applicationContext,
                MainDatabase::class.java,
                "database.db"
            ).build()
        }
    }

}
