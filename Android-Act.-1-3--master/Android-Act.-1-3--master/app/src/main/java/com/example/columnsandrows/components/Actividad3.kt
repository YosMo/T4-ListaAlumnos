package com.example.columnsandrows.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Act3(){
    Column(
        modifier = Modifier
            .height(300.dp)
            .width(200.dp)
            .background(Color(0xFFFFFFFF))
            .padding(5.dp)
    ) {
        Text(
            text = "",
            modifier = Modifier
                .background(Color(0xFF083043))
                .weight(1f)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "",
            modifier = Modifier
                .background(Color(0xFF3DDC85))
                .weight(1f)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "",
            modifier = Modifier
                .background(Color(0xFF083043))
                .weight(1f)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(5.dp))
        Row (
            modifier = Modifier
                .weight(3f)
                .fillMaxWidth()
        ) {
            Text(
                text = "",
                modifier = Modifier
                    .background(Color(0xFF083043))
                    .weight(1f)
                    .fillMaxHeight()
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = "",
                modifier = Modifier
                    .background(Color(0xFF4186F5))
                    .weight(1f)
                    .fillMaxHeight()
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = "",
                modifier = Modifier
                    .background(Color(0xFF083043))
                    .weight(1f)
                    .fillMaxHeight()
            )
        }
    }

}