package com.evzinov.android.letstalk1509.map




//
//
//class MapFragment : Fragment() {
//
//    private val MAPKIT_API_KEY = "6f49644f-3d40-435b-8e6f-c590d7c0565c"
//    private val TARGET_LOCATION = Point(57.945933, 30.320045)
//
//    private lateinit var mapView: MapView
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        MapKitFactory.setApiKey(MAPKIT_API_KEY)
//        MapKitFactory.initialize(requireContext())
//
//        // Создание MapView.
//        val view = inflater.inflate(R.layout.map_main_yandex, container, false)
//        mapView = view.findViewById(R.id.map)
//
//        // Перемещение камеры в центр Санкт-Петербурга.
//        mapView.map.move(
//            CameraPosition(TARGET_LOCATION, 14.0f, 0.0f, 0.0f),
//            Animation(Animation.Type.SMOOTH, 5f),
//            null
//        )
//
//        return view
//    }
//
//    override fun onStop() {
//        // Вызов onStop нужно передавать инстансам MapView и MapKit.
//        mapView.onStop()
//        MapKitFactory.getInstance().onStop()
//        super.onStop()
//    }
//
//    override fun onStart() {
//        // Вызов onStart нужно передавать инстансам MapView и MapKit.
//        super.onStart()
//        MapKitFactory.getInstance().onStart()
//        mapView.onStart()
//    }
//}