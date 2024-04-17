package com.example.parcial2.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.parcial2.R
import com.example.parcial2.components.CharacterCard
import com.example.parcial2.viewModels.charactersViewModels


@Composable
fun ListView(navController: NavHostController) {

    //Variables
    var prompt: String by remember { mutableStateOf("") }
    //var switchColor: Boolean = true
    var color: Color = Color(0xFF9FACBE)
    val GamesViewModel = charactersViewModels()

    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        Column () {
            /*OutlinedTextField(
                value = prompt,
                onValueChange = {prompt = it},
                label = { Text("Buscar por ID IEST o Nombre") },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon (
                        painter = painterResource(id = R.drawable.),
                        contentDescription = "Person",
                        tint = Color(0xFFD4A73C),
                    )
                },
            )

            Spacer(modifier = Modifier.height(5.dp))

            Button(
                onClick = {
                    val charList = GamesViewModel.getCharList()
                    val luckyAlumn = charList.random()
                    val message = "Alumno afortunado 🍀"

                    navController.navigate("CharView" +
                            "/$message" +
                            "/${luckyAlumn.sex}" +
                            "/${luckyAlumn.age}" +
                            "/${luckyAlumn.hobby}" +
                            "/${luckyAlumn.profilePic}"
                    )
                },
                colors = ButtonDefaults.buttonColors(Color(0xFF4CAF50)),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(horizontal = 5.dp)
            ) {
                Text(
                    text = "Alumno afortunado 🍀",
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFFFFF),
                    fontSize = 20.sp
                )
            }*/
            Text(
                text = "¿Eres Chico o Chica?",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(20.dp))


        LazyColumn {
            items(GamesViewModel.getCharList()) {
                    char ->
                val charString = "${char.sex} - ${char.hobby}"

                if (charString.contains(prompt, ignoreCase = true)) {
                    CharacterCard(navController, char, color)
                    Spacer(modifier = Modifier.height(10.dp))

                    /*// Change bg color
                    if (switchColor) {
                        switchColor = false
                        color = Color(0xFFF2F2F2)
                    } else {
                        switchColor = true
                        color = Color(0xFFF9EBCF)
                    }*/
                }
            }
        }
    }
}

/*@Preview(showBackground = true)
@Composable
fun Preview_List() {
    ListView(navController = rememberNavController())
}*/