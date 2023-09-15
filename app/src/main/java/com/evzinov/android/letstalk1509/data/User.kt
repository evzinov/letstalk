package com.evzinov.android.letstalk1509.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,

    @ColumnInfo(name = "login")
    var login: String,

    @ColumnInfo(name = "password")
    var password: String,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "description")
    val description: String

)
