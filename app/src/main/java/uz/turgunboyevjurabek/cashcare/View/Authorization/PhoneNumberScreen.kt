package uz.turgunboyevjurabek.cashcare.View.Authorization

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import uz.turgunboyevjurabek.cashcare.R
import uz.turgunboyevjurabek.cashcare.View.UIElements.CustomEdit

@Composable
fun PhoneNumberScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var son by remember {
            mutableStateOf("")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {

        }

        Box(
            modifier = Modifier
                .height(32.dp)
                .padding(top = 100.dp)
                .weight(1.5f)
                .align(Alignment.CenterHorizontally)
        ){
            Image(
                painter = painterResource(id = R.drawable.ic_ellipse2),
                contentDescription = null,
                modifier = Modifier
                    .size(20.dp)
            )
            Text(
                text = "Telefon raqamingizni kiriting",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(start = 6.dp,top=6.dp)
            )
        }



        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(2f)
                .padding(start = 20.dp, end = 20.dp),
        ) {
            Text(text = "Telefon raqam:", fontSize = 12.sp)
            son=CustomEdit()
            val context= LocalContext.current
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
        ) {

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 15.dp, end = 20.dp, start = 20.dp)
                    .height(45.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor =  if (son != ""){
                        colorResource(id = R.color.bacUI)
                    }else{
                        Color.Cyan
                    },
                    contentColor = Color.White,
                ),
                onClick = {
                    navController.navigate("InputSmsScreen")
                }) {
                Text(text = "Boshlash", fontSize = 12.sp)
            }

        }


    }
    
}

@Preview(showSystemUi = true)
@Composable
private fun UIPhoneNumber() {
    val navController= rememberNavController()
    PhoneNumberScreen(navController)
}