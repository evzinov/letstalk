package com.evzinov.android.letstalk1509.botton_navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.evzinov.android.letstalk1509.account_menu.AccountMenu
import com.evzinov.android.letstalk1509.chats.CardsMessage
import com.evzinov.android.letstalk1509.data.User
import com.evzinov.android.letstalk1509.map.MapScreen



import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = "screen_2"){
        composable("screen_1"){
            MapScreen()
        }
        composable("screen_2"){
                CardsMessage()
        }
//        composable("screen_3"){
//            AccountMenu(name = "HarP", message = "Отдыхаю")
//        }

        composable("screen_3") {
            val context = androidx.compose.ui.platform.LocalContext.current
            val database = com.evzinov.android.letstalk1509.data.MainDatabase.getDb(context)
            val userD = database.getDao()

            val userId = 2


                //val user by remember
            var user by remember{
                mutableStateOf<User?>(null)
            }

            val coroutineScope = rememberCoroutineScope()

            LaunchedEffect(userId) {
                coroutineScope.launch {
                    val fetchedUser = withContext(Dispatchers.IO) {
                        userD.getUserById(userId)
                    }
                    user = fetchedUser
                }
            }

            user?.let {
                com.evzinov.android.letstalk1509.account_menu.AccountMenu(
                    name = it.name,
                    message = it.description
                )
            }
        }
    }
}