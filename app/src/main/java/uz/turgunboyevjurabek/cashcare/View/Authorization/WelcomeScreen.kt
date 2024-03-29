package uz.turgunboyevjurabek.cashcare.View.Authorization

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.turgunboyevjurabek.cashcare.R

@Composable
fun WelcomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.bacUI))
            .statusBarsPadding()

    ) {
        /**
         * 2 ta doiraniki
         */
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Box(
                modifier = Modifier
                    .padding(start = 10.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.ic_ellipse1),
                    contentDescription = null,
                    Modifier
                        .size(15.dp)
                )
            }

            Box(
                modifier = Modifier
                    .padding(end=165.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.ic_ellipse1),
                    contentDescription = null,
                    Modifier
                        .size(35.dp)
                )
            }

        }

        /**
         * Textlar va logo
         */
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier
                    .align(Alignment.CenterVertically)

            ){
                Image(
                    painter = painterResource(id = R.drawable.ic_ellipse1),
                    contentDescription = null,
                    Modifier
                        .size(35.dp)
                )
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Xush kelibsiz",
                    fontSize = 20.sp,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "LOGO",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(top=20.dp)
                )
                Text(
                    text = "Cash Care",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,
                    modifier = Modifier
                        .padding(top=20.dp)
                )




            }
            Box(
                modifier = Modifier
                    .padding(20.dp)
            ){
            }
        }

        val text="Lorem ipsum dolor sit amet consectetur. Accumsan amet aliquam tristique erat morbi. Sociis aliquet leo metus turpis diam nibh."
        Text(
            text = text,
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .alpha(0.4f)
                .padding(top = 220.dp, start = 20.dp, end = 20.dp)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            verticalArrangement = Arrangement.Bottom
        ) {
          Box(
              Modifier.padding(start = 11.dp, end = 11.dp, bottom = 35.dp)
          ){
              Button(
                  modifier = Modifier
                      .fillMaxWidth()
                      .padding(12.dp)
                      .height(40.dp),
                  shape = RoundedCornerShape(10.dp),
                  colors = ButtonDefaults.buttonColors(
                      containerColor = Color.White,
                      contentColor = colorResource(id = R.color.bacUI)
                  ),
                  onClick = {

                  }) {
                  Text(text = "Boshlash", fontSize = 12.sp)
              }
              Box(
                  modifier = Modifier
                      .align(Alignment.TopEnd)

              ){
                  Image(
                      painter = painterResource(id = R.drawable.ic_ellipse1),
                      contentDescription = null,
                      Modifier
                          .size(35.dp)
                  )
              }
          }


        }


    }


}

@Preview
@Composable
fun UIWelcome() {
    WelcomeScreen()
    
}