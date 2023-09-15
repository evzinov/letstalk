package com.evzinov.android.letstalk1509.chats

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.evzinov.android.letstalk1509.data.Datasourse
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.tooling.preview.Preview
import com.evzinov.android.letstalk1509.R
import com.evzinov.android.letstalk1509.chats.CardMessage
import com.evzinov.android.letstalk1509.model.Message
import com.evzinov.android.letstalk1509.ui.theme.Letstalk1509Theme

@Composable
fun CardsMessage(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        val messageList =  Datasourse().loadMessageList()

        items(
            items = messageList,
        ) { message ->
CardMessage(message = message)
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun CardsMessagePreview() {
//    val message = Message(
//        nameStringResourceId = R.string.name1,
//        messageStringResourceId = R.string.message1,
//        dataStringResourceId = R.string.date1,
//        imageResourceId = R.drawable.harry_potter1
//    )
//    LetsTalkTheme() {
//        CardMessage(message = message)
//    }
//}

