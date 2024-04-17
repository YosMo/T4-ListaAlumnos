package com.example.columnsandrows.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun TheColumnsAndRows(){
    Row() {
        Column(
            modifier = Modifier
                .height(200.dp)
                .padding(3.dp)
            ,
            horizontalAlignment = Alignment.CenterHorizontally,
            ) {
            Text(
                text = "Caja 1",
                modifier = Modifier
                    .background(Color(0xFFFBFADA))
                    .weight(1f)
            )
            Text(
                text = "Caja 4",
                modifier = Modifier
                    .background(Color(0xFFE0CCBE))
                    .weight(1f)
            )
            Text(
                text = "Caja 7",
                modifier = Modifier
                    .background(Color(0xFFFC6736))
                    .weight(1f)
            )
        }

        Column(
            modifier = Modifier
                .height(200.dp)
                .padding(3.dp)
            ,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Caja 2",
                modifier = Modifier
                    .background(Color(0xFF726E00))
                    .weight(1f)
            )
            Text(
                text = "Caja 5",
                modifier = Modifier
                    .background(Color(0xFF10FF00))
                    .weight(1f)
            )
            Text(
                text = "Caja 8",
                modifier = Modifier
                    .background(Color(0xFF673AB7))
                    .weight(1f)
            )
        }

        Column(
            modifier = Modifier
                .height(200.dp)
                .padding(3.dp)
            ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Caja 3",
                modifier = Modifier
                    .background(Color(0xFFF3D7CA))
                    .weight(1f)
            )
            Text(
                text = "Caja 6",
                modifier = Modifier
                    .background(Color(0xFFE6A4B4))
                    .weight(1f)
            )
            Text(
                text = "Caja 9",
                modifier = Modifier
                    .background(Color(0xFFE9F6FF))
                    .weight(1f)
            )
        }
    }

}