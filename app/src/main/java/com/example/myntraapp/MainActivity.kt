package com.example.myntraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.insets.ui.Scaffold


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

                    Scaffold(

                        bottomBar = { BottomNavigationBar(navController) }
                    ) {
                        BottomNavGraph(navController = navController)
                    }
                }
            }
        }