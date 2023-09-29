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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
//import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.evzinov.android.letstalk1509.R
import com.evzinov.android.letstalk1509.data.MainDatabase
import com.evzinov.android.letstalk1509.ui.theme.Letstalk1509Theme



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
                modifier = Modifier.padding(start = 8.dp, top = 8.dp, end = 4.dp, bottom = 8.dp)
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
                    .padding(start = 32.dp, bottom = 4.dp)
            ) {
                Row(
                    modifier = Modifier.clickable { },
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        modifier = Modifier.padding(bottom = 4.dp),
                        text = stringResource(R.string.change_profile_photo)
                    )
                }
                Row(
                    modifier = Modifier.clickable {
                       // navController.navigate("changeUserNameScreen/${userId}")
                    },
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        modifier = Modifier.padding(bottom = 4.dp),
                        text = stringResource(R.string.change_name)
                    )
                }
                Row(
                    modifier = Modifier.clickable { },
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        modifier = Modifier.padding(bottom = 4.dp),
                        text = stringResource(R.string.change_phone_number)

                    )
                }
                Row(
                    modifier = Modifier.clickable { },
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        modifier = Modifier.padding(bottom = 4.dp),
                        text = stringResource(R.string.change_your_information)

                    )
                }


                Row(
                    modifier = Modifier.clickable { },
                    verticalAlignment = Alignment.CenterVertically
                ) {


                    Image(
                        painter = painterResource(R.drawable.baseline_close_24),
                        contentDescription = "image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(20.dp)

                    )
                    Text(
                        modifier = Modifier.padding(start = 20.dp),
                        text = stringResource(R.string.log_out_account)

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