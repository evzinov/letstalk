package com.evzinov.android.letstalk1509.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Message(
    @StringRes val messageStringResourceId: Int,
    @StringRes val dataStringResourceId: Int,
    @StringRes val nameStringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
