package uz.turgunboyevjurabek.cashcare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import uz.turgunboyevjurabek.cashcare.Model.AuthNavigation.AuthNavigation
import uz.turgunboyevjurabek.cashcare.Prezentation.ViewScreens.Authorization.InputSmsScreen
import uz.turgunboyevjurabek.cashcare.Prezentation.ViewScreens.home.HomeScreen
import uz.turgunboyevjurabek.cashcare.ui.theme.CashCareTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CashCareTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    var screenName by rememberSaveable {
                        mutableStateOf("Asosiy")
                    }

                Column {
//                    AuthNavigation()
                    HomeScreen()
                    }
                }
            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    CashCareTheme {

    }
}