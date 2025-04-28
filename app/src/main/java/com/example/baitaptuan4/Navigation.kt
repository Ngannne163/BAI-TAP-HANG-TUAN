package com.example.baitaptuan4

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.baitaptuan4.screen.DetailScreen
import com.example.baitaptuan4.screen.ListScreen
import com.example.baitaptuan4.screen.RootScreen


@Composable
fun Myapp() {
    val NavController = rememberNavController()
    NavHost(navController = NavController, startDestination = "RootScreen")
    {
        composable("RootScreen") {
            RootScreen(navController = NavController)
        }

        composable("ListScreen") {
            ListScreen(navController = NavController)
        }

        composable("DetailScreen") {
            DetailScreen(navController = NavController)
        }
    }
}

