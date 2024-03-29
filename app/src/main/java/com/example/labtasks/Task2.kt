package com.example.labtasks

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Task2Nav() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Login") {
        composable(route="Login"){
            LoginScreen(navController)
        }
        composable(route="Signup"){
            SignUpScreen(navController)
        }
    }
}