package com.example.bai2_tuan3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bai2_tuan3.loginscreen.LoginScreen
import com.example.bai2_tuan3.loginscreen.ProfileScreen
import com.example.bai2_tuan3.onboardingscreen.GetStarted1
import com.example.bai2_tuan3.onboardingscreen.GetStarted2
import com.example.bai2_tuan3.onboardingscreen.GetStarted3
import com.example.bai2_tuan3.onboardingscreen.GoodbyeScreen
import com.example.bai2_tuan3.onboardingscreen.SplashScreen

import com.example.bai2_tuan3.ui.theme.Bai2_tuan3Theme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            Bai2_tuan3Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    val navController = rememberNavController()

                    NavHost(navController= navController, startDestination ="SplashScreen")
                    {
                        composable("SplashScreen"){
                            SplashScreen(navController)
                        }
                        composable("manhinh1"){
                            GetStarted1(navController)
                        }
                        composable("manhinh2"){
                            GetStarted2(navController)
                        }
                        composable("manhinh3"){
                            GetStarted3(navController)
                        }
                        composable("Login"){
                            LoginScreen(navController)
                        }
                        composable("Profile"){
                            ProfileScreen(navController)
                        }
                        composable("Goodbye"){
                            GoodbyeScreen(navController)
                        }

                    }
                }
            }

        }
    }
}

