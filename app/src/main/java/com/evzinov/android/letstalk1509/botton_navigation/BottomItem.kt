package com.evzinov.android.letstalk1509.botton_navigation

import com.evzinov.android.letstalk1509.R


sealed class BottomItem(val title: String, val iconId: Int, val route: String){
    object TabMap: BottomItem("Карта", R.drawable.baseline_map_24, "screen_1")
    object TabMessage: BottomItem("Сообщения", R.drawable.baseline_mail_24, "screen_2")
    object TabAccount: BottomItem("Аккаунт", R.drawable.baseline_manage_accounts_24, "screen_3")

}