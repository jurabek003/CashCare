package uz.turgunboyevjurabek.cashcare.Prezentation.MainNavigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uz.turgunboyevjurabek.cashcare.Prezentation.ViewScreens.AllDebtorsScreen
import uz.turgunboyevjurabek.cashcare.Prezentation.ViewScreens.home.HomeScreen

@Composable
fun MainNavigation() {
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = "HomeScreen"){

        composable("HomeScreen"){
            HomeScreen(navController = navHostController)
        }
        composable("AllDebtorsScreen"){
            AllDebtorsScreen(navController = navHostController)
        }

    }
}