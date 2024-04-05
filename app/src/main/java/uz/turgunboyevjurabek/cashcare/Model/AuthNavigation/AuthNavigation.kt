package uz.turgunboyevjurabek.cashcare.Model.AuthNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uz.turgunboyevjurabek.cashcare.View.Authorization.InputSmsScreen
import uz.turgunboyevjurabek.cashcare.View.Authorization.LanguageScreen
import uz.turgunboyevjurabek.cashcare.View.Authorization.PhoneNumberScreen
import uz.turgunboyevjurabek.cashcare.View.Authorization.WelcomeScreen

@Composable
fun AuthNavigation() {
    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = "WelcomeScreen" ){
        composable("WelcomeScreen"){
            WelcomeScreen(navController = navHostController)
        }
        composable("LanguageScreen"){
            LanguageScreen(navController = navHostController)
        }
        composable("PhoneNumberScreen"){
            PhoneNumberScreen(navController = navHostController)
        }
        composable("InputSmsScreen"){
            InputSmsScreen(navController = navHostController)
        }

    }

}