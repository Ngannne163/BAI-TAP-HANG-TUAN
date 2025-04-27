package com.example.bai2_tuan3.onboardingscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.bai2_tuan3.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController){
    LaunchedEffect(key1 = true) {
        delay(3000)
        navController.navigate("manhinh1"){
            popUpTo("SplashScreen"){
                inclusive = true
            }
        }
    }
    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {

        Image(
            painter = painterResource(R.drawable.uthlogin),
            contentDescription = "man hinh 3",
            modifier = Modifier
                .size(200.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "UTH SmartTask",
            fontSize = (30.sp),
            color = Color(0xFF130160),
            fontWeight = FontWeight.Bold,
        )

    }
}
