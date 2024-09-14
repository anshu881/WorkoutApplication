package com.example.myntraapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") { HomeScreen( navController) }
        composable("categories") { CategoriesScreen() }
        composable("cart") { CartScreen() }
        composable("favorite"){ FavouriteScreen() }
        composable("profile") { ProfileScreen() }
    }
}


