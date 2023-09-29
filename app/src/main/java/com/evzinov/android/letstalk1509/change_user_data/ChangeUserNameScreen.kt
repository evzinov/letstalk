package com.evzinov.android.letstalk1509.change_user_data

//@Composable
//fun ChangeUserNameScreen(
//    userDao: UserDao, // Передайте DAO в качестве параметра
//    userId: 1 // Передайте идентификатор пользователя
//) {
//    val user = userDao.getUserById(userId)
//
//    var newName by remember { mutableStateOf(user.name) }
//
//    Column {
//        TextField(
//            value = newName,
//            onValueChange = { newName = it },
//            label = { Text("New Name") }
//        )
//
//        Button(
//            onClick = {
//                val updatedUser = user.copy(name = newName)
//                userDao.updateUser(updatedUser)
//            }
//        ) {
//            Text("Save")
//        }
//    }
//}