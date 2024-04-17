package com.example.parcial2.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun CharacterView(
    navController: NavHostController,
    message: String,
    age: Int,
    sex: String,
    hobby: String,
    profilePic: Int
) {
    Column (
        modifier = Modifier.fillMaxSize().padding(15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        if (message == "Character") {
            Text(
                text = message,
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic
            )

            Spacer(modifier = Modifier.height(15.dp))
        }

        Image(
            painter = painterResource(id = profilePic),
            contentDescription = "CharPic",
            modifier = Modifier.size(150.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = sex,
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = hobby,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "${age} años",
            color = Color(0xFFD4A73C),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )


        Button(
            onClick = {navController.popBackStack()},
            colors = ButtonDefaults.buttonColors(Color(0xFFD4A73C)),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(horizontal = 5.dp)
        ) {
            Text(
                text = "Volver",
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp
            )
        }
    }
}
/*
@Preview(showBackground = true)
@Composable
fun Preview_Alumn() {
    CharView(
        navController = rememberNavController(),
        message = "Alumno afortunado 🍀",
        id = 19666,
        name = "Sebastián Rubio Quiroz",
        mail = "sebastian.rubio@iest.edu.mx",
        semester = 8,
        career = "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)",
        hasScolarship = true,
        gpa = 9.85.toFloat(),
        soldTickets = 0,
        profilePic = R.drawable.person
    )
}*/