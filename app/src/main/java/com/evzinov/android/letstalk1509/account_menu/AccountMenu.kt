package com.evzinov.android.letstalk1509.account_menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
//import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.evzinov.android.letstalk1509.R
import com.evzinov.android.letstalk1509.data.MainDatabase
import com.evzinov.android.letstalk1509.ui.theme.Letstalk1509Theme

//@Composable
//fun MyScreen() {
//    val context = LocalContext.current
//    val database = MainDatabase.getDb(context)
//    val userD = database.getDao()
//
//    val userId = 1
//    val user = userD.getUserById(userId)
//
//    user?.let {
//        AccountMenu(name = it.name, message = it.description)
//    }
//}

@Composable

fun AccountMenu(name: String, message: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()

    ) {
        Column()
        {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 4.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.harry_potter1),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(72.dp)
                        .clip(CircleShape)
                )
                Column(
                    modifier = Modifier.padding(start = 8.dp)
                ) {


                    Text(
                        text = name,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.W500,
                        overflow = TextOverflow.Ellipsis
                    )



                    Text(
                        modifier = Modifier.padding(end = 8.dp),
                        text = message,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 4

                    )

                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 32.dp)
            ) {
                Row(
                    modifier = Modifier.clickable { },
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Image(
                        painter = painterResource(R.drawable.harry_potter1),
                        contentDescription = "image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(20.dp)
                            .clip(CircleShape)
                    )
                    Text(
                        modifier = Modifier.padding(start = 20.dp),
                        text = message
                    )
                }
                Row(
                    modifier = Modifier.clickable { },
                    verticalAlignment = Alignment.CenterVertically
                ) {


                    Image(
                        painter = painterResource(R.drawable.harry_potter1),
                        contentDescription = "image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(20.dp)
                            .clip(CircleShape)
                    )
                    Text(
                        modifier = Modifier.padding(start = 20.dp),
                        text = message
                    )
                }
                Row(
                    modifier = Modifier.clickable { },
                    verticalAlignment = Alignment.CenterVertically
                ) {


                    Image(
                        painter = painterResource(R.drawable.harry_potter1),
                        contentDescription = "image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(20.dp)
                            .clip(CircleShape)
                    )
                    Text(
                        modifier = Modifier.padding(start = 20.dp),
                        text = message

                    )
                }
                Row(
                    modifier = Modifier.clickable { },
                    verticalAlignment = Alignment.CenterVertically
                ) {


                    Image(
                        painter = painterResource(R.drawable.harry_potter1),
                        contentDescription = "image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(20.dp)
                            .clip(CircleShape)
                    )
                    Text(
                        modifier = Modifier.padding(start = 20.dp),
                        text = message

                    )
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreviewAccount() {
    Letstalk1509Theme() {
        AccountMenu(name = "Harry P", message = "сплю")

    }
}