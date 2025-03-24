package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Preview(showBackground = true)
@Composable
fun RootScreen(navController: NavController ?=null) {

    Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(Color.White, shape= RoundedCornerShape(24.dp)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
        {
            Spacer(modifier = Modifier.weight(1f))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally)
            {
            Image(
                painter = painterResource(id=R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier.size(200.dp),)

            Spacer(modifier = Modifier.height(36.dp))

            Text(
                text= "Jetpack Compose",
                fontSize= 20.sp,
                fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text= "Jetpack Compose is a modern UI toolkit for building native Android applications using a declarative programming approach.",
                fontSize= 16.sp,
                textAlign = TextAlign.Center,)}

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = {
                    if (navController != null) {
                        navController.navigate("List")
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp),
            ) {
                Text(
                    text = "I'm ready",
                    fontSize = 24.sp
                )
            }
        }
    }