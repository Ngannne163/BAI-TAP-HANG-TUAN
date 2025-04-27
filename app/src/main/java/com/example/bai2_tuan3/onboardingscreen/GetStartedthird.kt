 package com.example.bai2_tuan3.onboardingscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.IconButton
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.bai2_tuan3.R

 @Composable
fun GetStarted3(navController: NavController) {

         Column(
             modifier = Modifier
                 .fillMaxSize()
                 .padding(20.dp)
                 .verticalScroll(rememberScrollState())
                 .background(Color.White),
             verticalArrangement = Arrangement.SpaceBetween,
             horizontalAlignment = Alignment.CenterHorizontally
         )
         {
             Row(
                 modifier = Modifier
                     .fillMaxWidth()
                     .padding(vertical = 4.dp),
                 horizontalArrangement = Arrangement.SpaceBetween,
                 verticalAlignment = Alignment.CenterVertically
             )
             {
                 PageIndicator(currentPage = 2)

                 Text(
                     text = "skip",
                     fontSize = 20.sp,
                     modifier = Modifier.clickable { navController.navigate("Login") },
                     color = Color(0xFF006EE9),
                     fontWeight = FontWeight.Bold
                 )
             }

             Column(
                 modifier = Modifier
                     .fillMaxWidth()
                     .padding(4.dp),
                 horizontalAlignment = Alignment.CenterHorizontally
             ) {
                 Image(
                     painter = painterResource(R.drawable.manhinh4),
                     contentDescription = "man hinh 3 ",
                     modifier = Modifier
                         .size(300.dp)
                 )

                 Spacer(modifier = Modifier.height(10.dp))

                 Text(
                     text = "Reminder Notification",
                     fontSize = 30.sp,
                     fontWeight = FontWeight.Bold
                 )

                 Spacer(modifier = Modifier.height(5.dp))

                 Text(
                     text = "The advantage of this application is that it also provides reminders for you so you don't forget to keep doing your assignments well and according to the time you have set",
                     fontSize = 18.sp,
                     textAlign = TextAlign.Center
                 )

             }

             Row(
                 modifier = Modifier
                     .padding(4.dp)
                     .fillMaxWidth(),
                 horizontalArrangement = Arrangement.SpaceBetween,
                 verticalAlignment = Alignment.CenterVertically
             ) {
                 IconButton(onClick = { navController.popBackStack() }) {
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

                 Spacer(modifier = Modifier.width(10.dp))

                 Button(
                     onClick = { navController.navigate("login") },
                     modifier = Modifier
                         .fillMaxWidth()
                         .padding(8.dp),
                     colors = ButtonDefaults.buttonColors(
                         containerColor = Color(0xFFD0E8FF),
                         contentColor = Color(0xFF130160)
                     ),
                     shape = RoundedCornerShape(20.dp)
                 ) {
                     Text(
                         text = "Get Started",
                         fontSize = 20.sp,
                         fontWeight = FontWeight.Bold
                     )
                 }
             }
         }
     }