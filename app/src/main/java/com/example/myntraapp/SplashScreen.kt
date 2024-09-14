package com.example.myntraapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.blue)),
        contentAlignment = Alignment.Center,

        ) {
        Column(
            modifier = Modifier.padding(0.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

          Box(contentAlignment = Alignment.Center
          ){

              Image(
                  painter = painterResource(id = R.drawable.logo),
                  contentDescription = "logo",
                  modifier = Modifier.size(160.dp)
                      .padding(bottom = 66.dp)
              )


              Text(text = "Find Something Different",
                  color = Color.White,
                  fontSize = 18.sp,
                  fontWeight = FontWeight.Bold,
                  modifier = Modifier.padding(top=42.dp),
              )
          }
        }
        LaunchedEffect(true) {
            delay(2000)
            navController.navigate("home screen") {
                popUpTo("splashscreen") { inclusive = true }
            }
        }
    }
}

