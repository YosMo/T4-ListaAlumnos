package com.example.alumnlisttarea4.components

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.alumnlisttarea4.R
import com.example.alumnlisttarea4.models.Alumn

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlumnCard(navController: NavHostController, alumn: Alumn, color: Color) {
    val message = "No afortunado"

    Card(
        colors = CardDefaults.cardColors(containerColor = color),
        onClick = {
            navController.navigate("AlumnView" +
                                            "/$message" +
                                            "/${alumn.id}" +
                                            "/${alumn.name}" +
                                            "/${alumn.mail}" +
                                            "/${alumn.semester}" +
                                            "/${alumn.career}" +
                                            "/${alumn.hasScolarship}" +
                                            "/${alumn.gpa.toFloat()}" +
                                            "/${alumn.soldTickets}" +
                                            "/${alumn.profilePic}"
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
                painter = painterResource(id = alumn.profilePic),
                contentDescription = "AlumnPic",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(100.dp)
            )

            Spacer(modifier = Modifier.width(18.dp))

            Column (

            ) {
                Text(
                    text = "${alumn.id} | ${alumn.name}",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "${alumn.mail}",
                    color = Color(0xFFD4A73C),
                    fontSize = 11.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "${alumn.career}",
                    fontSize = 11.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCard() {
    AlumnCard(
        navController = rememberNavController(),
        alumn = Alumn(19666, "Sebastián Rubio Quiroz", "sebastian.rubio@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.85, 0, R.drawable.student_icon),
        color = Color(0xFFF2F2F2)
    )
}