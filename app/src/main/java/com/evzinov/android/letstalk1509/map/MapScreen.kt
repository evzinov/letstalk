package com.evzinov.android.letstalk1509.map




import android.view.LayoutInflater
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import com.evzinov.android.letstalk1509.R
import com.yandex.mapkit.Animation
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.map.MapObjectCollection
import com.yandex.mapkit.mapview.MapView
import com.yandex.runtime.image.ImageProvider

// val CIRCLE_CENTER = Point(54.7456, 55.963)

@Composable
fun MapScreen(modifier: Modifier = Modifier) {

    val TARGET_LOCATION = Point(54.7431, 55.9678)
    val userLocation = Point(54.7456, 55.963)
    lateinit var mapView: MapView

    lateinit var mapObjectCollection: MapObjectCollection





    val lifecycleEvent = rememberLifecycleEvent()
    LaunchedEffect(lifecycleEvent) {
        if (lifecycleEvent == Lifecycle.Event.ON_START) {
            MapKitFactory.getInstance().onStart()
            mapView.onStart()
        }
        if (lifecycleEvent == Lifecycle.Event.ON_STOP) {
            mapView.onStop()
            MapKitFactory.getInstance().onStop()
        }
    }

    AndroidView(
        modifier = modifier,
        factory = { context ->
            MapKitFactory.initialize(context)
            val myView = LayoutInflater.from(context).inflate(R.layout.map_main_yandex, null, false)
            myView
        },
        update = { view ->
            mapView = view.findViewById<MapView>(R.id.map)
            mapView.map.move(
                CameraPosition(TARGET_LOCATION, 11.0f, 0.0f, 0.0f),
                Animation(Animation.Type.SMOOTH, 1.0f),
                null
            )

//            val placemarkTapListener = MapObjectTapListener { _, point ->
//                Toast.makeText(
//                    view.context,
//                    "Tapped the point (${point.longitude}, ${point.latitude})",
//                    Toast.LENGTH_SHORT
//                ).show()
//                true
//            }
//
//            val imageProvider = ImageProvider.fromResource(view.context, R.drawable.baseline_mail_24)
//            val placemark = mapObjectCollection.addPlacemark(userLocation, imageProvider)
//            placemark.addTapListener(placemarkTapListener)

        }
    )
}


@Composable
fun rememberLifecycleEvent(lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current): Lifecycle.Event {
    var state by remember { mutableStateOf(Lifecycle.Event.ON_ANY) }
    DisposableEffect(lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            state = event
        }
        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
        }
    }
    return state
}