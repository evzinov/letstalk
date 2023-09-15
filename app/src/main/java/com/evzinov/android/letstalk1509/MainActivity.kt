package com.evzinov.android.letstalk1509


import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.evzinov.android.letstalk1509.botton_navigation.MainScreen
import com.evzinov.android.letstalk1509.data.MainDatabase
import com.evzinov.android.letstalk1509.ui.theme.Letstalk1509Theme
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.GlobalScope
import android.content.Context
import com.yandex.mapkit.MapKitFactory


open class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //   yourMethod(this)
        // Log.d("MainActivity", "This is a debug log message.")
        val MAPKIT_API_KEY = "6f49644f-3d40-435b-8e6f-c590d7c0565c"
        MapKitFactory.setApiKey(MAPKIT_API_KEY)
        setContent {
            Letstalk1509Theme() {
                MainScreen()
            }
        }

    }
}
// логи базы данных
//    fun yourMethod(context: Context) {
//
//
//        val database = MainDatabase.getDb(context)
//        val dao = database.getDao()
//
//        dao.getAllUsers().onEach { users ->
//            for (user in users) {
//                Log.d("Room", "User: $user")
//            }
//        }.launchIn(GlobalScope)
//    }

