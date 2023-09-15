package com.evzinov.android.letstalk1509.chats

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.evzinov.android.letstalk1509.R
import com.evzinov.android.letstalk1509.ui.theme.Letstalk1509Theme
import com.evzinov.android.letstalk1509.data.Datasourse
import com.evzinov.android.letstalk1509.model.Message



@Composable
     fun CardMessage(message: Message){
        Box (
            modifier= Modifier
                .fillMaxWidth()
                //.padding(4.dp)
                .clickable {  },
            //shape = RoundedCornerShape(15.dp)

        ){

            Row(verticalAlignment = Alignment.CenterVertically,  modifier = Modifier.padding(4.dp)) {
                Image(
                    painter = painterResource(R.drawable.harry_potter1),
                    contentDescription ="image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(4.dp)
                        .size(72.dp)
                        .clip(CircleShape)
                )
                Column(
                    modifier = Modifier.padding(start = 8.dp)
                ) {


                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),

                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween

                    ) {
                        Text(
                            text = LocalContext.current.getString(message.nameStringResourceId),
                            fontSize=20.sp,
                            fontWeight= FontWeight.W500,
                            overflow= TextOverflow.Ellipsis
                        )

                        Text(modifier = Modifier.padding(end = 4.dp),
                            text = LocalContext.current.getString(message.dataStringResourceId),
                            fontSize=10.sp,
                            textAlign = TextAlign.Right
                        )
                    }
                    Text(modifier = Modifier.padding(end = 8.dp),
                        text = LocalContext.current.getString(message.messageStringResourceId),
                        overflow= TextOverflow.Ellipsis,
                        maxLines = 2
                    )
                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun CardMessagePreview() {
    val message = Message(
        nameStringResourceId = R.string.name1,
        messageStringResourceId = R.string.message1,
        dataStringResourceId = R.string.date1,
        imageResourceId = R.drawable.harry_potter1
    )
    Letstalk1509Theme() {
        CardMessage(message = message)
    }
}
