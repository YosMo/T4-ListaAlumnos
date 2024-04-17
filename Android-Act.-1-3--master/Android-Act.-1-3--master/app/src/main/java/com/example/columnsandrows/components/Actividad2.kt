package com.example.columnsandrows.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Block(text: String, color: Color, background: Color) {
    Box(
        modifier = Modifier
            .padding(3.dp)
            .background(background)
            .fillMaxWidth()
            .height(50.dp)
    ) {
        Text(
            text = text,
            color = color,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.Center),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Act2(){
    Row(
        modifier = Modifier.width(200.dp).background(Color(0xFFBBADA0))
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Block(text = "16", color = Color(0xFFFFFFFF), background = Color(0xFFF59563))
            Block(text = "128", color = Color(0xFFFFFFFF), background = Color(0xFFEDCF72))
            Block(text = "32", color = Color(0xFFFFFFFF), background = Color(0xFFF67C5F))
            Block(text = "16", color = Color(0xFFFFFFFF), background = Color(0xFFF59563))
        }
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Block(text = "", color = Color(0xFFFFFFFF), background = Color(0xFFCDC1B4))
            Block(text = "16", color = Color(0xFFFFFFFF), background = Color(0xFFF59563))
            Block(text = "64", color = Color(0xFFFFFFFF), background = Color(0xFFF65E3B))
            Block(text = "8", color = Color(0xFFFFFFFF), background = Color(0xFFF2B179))
        }
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Block(text = "", color = Color(0xFFFFFFFF), background = Color(0xFFCDC1B4))
            Block(text = "", color = Color(0xFFFFFFFF), background = Color(0xFFCDC1B4))
            Block(text = "2", color = Color(0xFF000000), background = Color(0xFFEEE4DA))
            Block(text = "8", color = Color(0xFFFFFFFF), background = Color(0xFFF2B179))
        }
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Block(text = "4", color = Color(0xFF000000), background = Color(0xFFEDE0C8))
            Block(text = "", color = Color(0xFFFFFFFF), background = Color(0xFFCDC1B4))
            Block(text = "", color = Color(0xFFFFFFFF), background = Color(0xFFCDC1B4))
            Block(text = "2", color = Color(0xFF000000), background = Color(0xFFEEE4DA))
        }
    }
}