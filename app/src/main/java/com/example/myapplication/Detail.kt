package com.example.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Preview(showBackground = true)
@Composable
fun DetailScreen(navController: NavController?=null) {
Column(
    modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),

){
    Spacer(modifier = Modifier.height(40.dp))

    Text(
        text = "Text Detail",
        fontSize = 27.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Blue,
        modifier = Modifier.align(Alignment.CenterHorizontally)
    )}

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = buildAnnotatedString {
                append("The ")

                withStyle(style = SpanStyle(textDecoration = TextDecoration.LineThrough, fontSize = 30.sp)) {
                    append("quick")
                }
                append(" ")

                withStyle(style = SpanStyle(color = Color(0xFF9C601D), fontSize = 40.sp)) {
                    append("Brown")
                }
                append("\nfox j u m p s ")

                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic, fontFamily= FontFamily.SansSerif, fontSize=30.sp)) {
                    append("over")
                }
                append("\n")

                withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)) {
                    append("the ")
                }
                withStyle(style = SpanStyle(fontStyle = FontStyle.Italic, fontFamily = FontFamily.SansSerif, fontSize= 20.sp))  {
                    append("lazy")
                }

                append(" dog.")
            },
            fontSize = 30.sp
        )
    }
}