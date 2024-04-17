package com.example.parcial2.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.parcial2.models.Char

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CharacterCard(navController: NavHostController, char: Char, color: Color) {
    val message = "¿Eres Chico o Chica?"

    Card(
        colors = CardDefaults.cardColors(containerColor = color),
        onClick = {
            navController.navigate("CharacterView" +
                    "/$message" +
                    "/${char.age}" +
                    "/${char.sex}" +
                    "/${char.hobby}"+
                    "/${char.profilePic}"
            )
        }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 20.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = char.profilePic),
                contentDescription = "CharPic",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(100.dp)
            )

            Spacer(modifier = Modifier.width(18.dp))

            Column (

            ) {
                Text(
                    text = "${char.hobby}",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "${char.sex}",
                    color = Color(0xFFD4A73C),
                    fontSize = 11.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "${char.age} años",
                    fontSize = 11.sp
                )
            }
        }
    }
}
/*
@Preview(showBackground = true)
@Composable
fun PreviewCard() {
    AlumnCard(
        navController = rememberNavController(),
        alumn = Alumn(19666, "Sebastián Rubio Quiroz", "sebastian.rubio@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.85, 0, R.drawable.person),
        color = Color(0xFFF2F2F2)
    )
}
*/