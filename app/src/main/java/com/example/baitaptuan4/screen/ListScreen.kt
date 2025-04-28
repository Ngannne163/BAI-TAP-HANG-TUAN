package com.example.baitaptuan4.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.baitaptuan4.R

@Composable
fun ListScreen (navController: NavHostController)
{
    val listState = rememberLazyListState()
    val listItems = List(1000000){ "The only way to do great work is to love what you do."}

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top= 40.dp)
            .padding(horizontal = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            verticalAlignment = Alignment.CenterVertically)
        {
            IconButton(
                onClick = { navController.popBackStack()}) {
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
            Spacer(modifier = Modifier.width(95.dp))

            Text(
                text = "LazyColumn",
                color = Color(0xFF006EE9),
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold)
        }
        Spacer(modifier = Modifier.height(10.dp))

    LazyColumn(
        state = listState,
        modifier = Modifier
            .fillMaxSize())
    {
        itemsIndexed(listItems){ index, item ->
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(4.dp, Color.White, RoundedCornerShape(8.dp))
                .background(Color(0x63408FD0)))
        {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "0$index | $item",
                    fontSize = 20.sp,
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(10.dp))


                    IconButton(
                        onClick = {navController.navigate("DetailScreen") },
                        modifier = Modifier
                            .padding(end = 8.dp)
                            .size(55.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .background(Color.Gray),
                    ) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = "next"
                        )
                    }
                }
            }

        }

    }
}
}