package com.example.baitaptuan4.screen


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.baitaptuan4.R


@Composable
fun DetailScreen(navController: NavHostController)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp)
            .padding(horizontal = 8.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically)
        {
            IconButton(
                onClick = {navController.popBackStack()})
            {
                Icon(
                    painter = painterResource(R.drawable.back),
                    contentDescription = "back icon",
                    tint = Color.White,
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color(0xFF2196F3))
                        .clip(RoundedCornerShape(16.dp))
                        .padding(4.dp)
                        .weight(1f),
                )
            }

            Text(
                text = "Detail",
                fontSize = 30.sp,
                color = Color(0xFF006EE9),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,

            )
        }
        Text(
            text = "“The only way to do great work \nis to love what you do”",
            fontSize = 20.sp,
            textAlign = TextAlign.Center)

        Box(
            modifier = Modifier
                .size(height = 400.dp, width = 300.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF74B1E5),
                            Color(0xFF1D3577)
                        )
                    )
                ),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "The only way to do great work \nis to love what you do.",
                fontSize = 50.sp,
                textAlign = TextAlign.Center,
                color = Color.White
            )
        }

            Button(
                onClick = {navController.navigate("RootScreen")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .padding(bottom = 40.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2196F3)),
                shape = RoundedCornerShape(20.dp)
            )
            {
                Text(
                    text = "BACK TO ROOT",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier
                        .padding(16.dp))

            }
        }
}