package com.evzinov.android.letstalk1509.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.evzinov.android.letstalk1509.R
import com.evzinov.android.letstalk1509.model.Message

class Datasourse {
    fun loadMessageList(): List<Message> {
        return listOf<Message>(
            Message(
                R.string.message1,
                R.string.date1,
                R.string.name1,
                R.drawable.harry_potter1
            ),
            Message(
                R.string.message2,
                R.string.date1,
                R.string.name1,
                R.drawable.harry_potter1
            ),
            Message(
                R.string.message3,
                R.string.date1,
                R.string.name1,
                R.drawable.harry_potter1
            ),
            Message(
                R.string.message4,
                R.string.date1,
                R.string.name1,
                R.drawable.harry_potter1
            ),
            Message(
                R.string.message5,
                R.string.date1,
                R.string.name1,
                R.drawable.harry_potter1
            ),
            Message(
                R.string.message6,
                R.string.date1,
                R.string.name1,
                R.drawable.harry_potter1
            ),
            Message(
                R.string.message7,
                R.string.date1,
                R.string.name1,
                R.drawable.harry_potter1
            ),
            Message(
                R.string.message8,
                R.string.date1,
                R.string.name1,
                R.drawable.harry_potter1
            ),
            Message(
                R.string.message9,
                R.string.date1,
                R.string.name1,
                R.drawable.harry_potter1
            ),
            Message(
                R.string.message10,
                R.string.date1,
                R.string.name1,
                R.drawable.harry_potter1
            )
        )
    }
}
