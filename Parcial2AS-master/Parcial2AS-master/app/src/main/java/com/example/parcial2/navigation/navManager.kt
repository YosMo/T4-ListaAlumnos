package com.example.parcial2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.parcial2.views.ListView

@Composable
fun NavManager() {
    var navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "ListView") {

        //Definiendo Rutas
        composable(route = "ListView") {
            ListView(navController)
        }

        composable(route = "CharacterView" +
                "/{message}" +
                "/{profilePic}" +
                "/{age}" +
                "/{sex}" +
                "/{hobby}" ,


            arguments =
            listOf(
                navArgument("message") {type = NavType.StringType},
                navArgument("profilePic") {type = NavType.IntType},
                navArgument("age") {type = NavType.IntType},
                navArgument("sex") {type = NavType.StringType},
                navArgument("hobby") {type = NavType.StringType}
            )
        ) {
                parameters ->
            val message = parameters.arguments?.getString("message") ?: ""
            val profilePic = parameters.arguments?.getInt("profilePic") ?: 0
            val age = parameters.arguments?.getInt("age") ?: 0
            val sex = parameters.arguments?.getString("sex") ?: ""
            val hobby = parameters.arguments?.getString("hobby") ?: ""

            /*CharacterView(
                navController,
                message,
                profilePic,
                age,
                sex,
                hobby
            )*/
        }
    }
}