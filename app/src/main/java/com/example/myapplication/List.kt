package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Preview(showBackground = true)
@Composable
fun ListScreen(navController: NavController ?=null) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White)
    )
    {
        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "UI Components Lists",
            fontSize = 27.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
            modifier = Modifier.align (Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Display",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            onClick = {
                if (navController != null) {
                    navController.navigate("textDetail")
                }
            },
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD0E8FF), contentColor = Color.Black),
            modifier = Modifier
                .fillMaxWidth(),
            contentPadding = PaddingValues(10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ){
                Column{
                Text(text = "Text", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Text(text="Displays text",fontWeight = FontWeight.Normal, fontSize = 18.sp)
        }}
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { /* TODO: Handle click */ },
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD0E8FF), contentColor = Color.Black),
            modifier = Modifier
                .fillMaxWidth(),
            contentPadding = PaddingValues(10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Column{
                    Text(text = "Text", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    Text(text="Displays an image",fontWeight = FontWeight.Normal, fontSize = 18.sp)
                }}
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Input",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            onClick = { /* TODO: Handle click */ },
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD0E8FF), contentColor = Color.Black),
            modifier = Modifier
                .fillMaxWidth(),
            contentPadding = PaddingValues(10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ){
                Column{
                    Text(text = "TextField", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    Text(text="Input field for text",fontWeight = FontWeight.Normal, fontSize = 18.sp)
                }}
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { /* TODO: Handle click */ },
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD0E8FF), contentColor = Color.Black),
            modifier = Modifier
                .fillMaxWidth(),
            contentPadding = PaddingValues(10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Column{
                    Text(text = "PasswordField", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    Text(text="Input field for password",fontWeight = FontWeight.Normal, fontSize = 18.sp)
                }}
        }


        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Layout",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(5.dp))

        Button(
            onClick = { /* TODO: Handle click */ },
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD0E8FF), contentColor = Color.Black),
            modifier = Modifier
                .fillMaxWidth(),
            contentPadding = PaddingValues(10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ){
                Column{
                    Text(text = "Column", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    Text(text="Arranges elements vertically",fontWeight = FontWeight.Normal, fontSize = 18.sp)
                }}
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { /* TODO: Handle click */ },
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD0E8FF), contentColor = Color.Black),
            modifier = Modifier
                .fillMaxWidth(),
            contentPadding = PaddingValues(10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Column{
                    Text(text = "Row", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    Text(text="Arranges elements horizontally",fontWeight = FontWeight.Normal, fontSize = 18.sp)
                }}
        }

        }
    }
