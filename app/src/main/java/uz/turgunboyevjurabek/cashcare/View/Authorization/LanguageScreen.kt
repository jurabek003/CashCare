package uz.turgunboyevjurabek.cashcare.View.Authorization

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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.turgunboyevjurabek.cashcare.R
@Composable
fun LanguageScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
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
                text = "Tilni tanlang",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(start = 6.dp,top=6.dp)
            )
        }

        var rus by remember {
            mutableStateOf(false)
        }
        var uzb by remember {
            mutableStateOf(true)
        }
        var eng by remember {
            mutableStateOf(false)
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(2f)
                .padding(start = 30.dp, end = 30.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Box(
                modifier = Modifier
                    .width(85.dp)
                    .height(125.dp)
                    .clip(RoundedCornerShape(10.dp))
            ){
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(if (rus) colorResource(id = R.color.bacUI) else Color.Transparent)
                        .clickable {
                            rus = !rus
                            uzb = false
                            eng = false
                        },
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rus),
                        contentDescription = "rus",
                        modifier = Modifier
                            .size(55.dp)
                    )
                    Text(
                        text = "Русскый",
                        fontWeight = if (rus) FontWeight.SemiBold
                        else FontWeight.Normal,
                        fontSize = 12.sp
                    )

                }
            }
            Box(
                modifier = Modifier
                    .width(85.dp)
                    .height(125.dp)
                    .clip(RoundedCornerShape(10.dp))
            ){
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(if (uzb) colorResource(id = R.color.bacUI) else Color.Transparent)
                        .clickable {
                            uzb = !uzb
                            eng = false
                            rus = false
                        },
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.usz),
                        contentDescription = "uzb",
                        modifier = Modifier
                            .size(55.dp)
                    )
                    Text(
                        text = "O’zbekcha",
                        fontWeight = if (uzb) FontWeight.SemiBold
                        else FontWeight.Normal,
                        fontSize = 12.sp
                    )

                }
            }
            Box(
                modifier = Modifier
                    .width(85.dp)
                    .height(125.dp)
                    .clip(RoundedCornerShape(10.dp))
            ){
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(if (eng) colorResource(id = R.color.bacUI) else Color.Transparent)
                        .clickable {
                            eng = !eng
                            uzb = false
                            rus = false
                        },
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.eng),
                        contentDescription = "rus",
                        modifier = Modifier
                            .size(55.dp)
                    )
                    Text(
                        text = "English",
                        fontWeight = if (eng) FontWeight.SemiBold
                        else FontWeight.Normal,
                        fontSize = 12.sp
                    )

                }
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
        ) {

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
                    .height(40.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.bacUI),
                    contentColor =Color.White,
                ),
                onClick = {

                }) {
                Text(text = "Boshlash", fontSize = 12.sp)
            }

        }


    }

}

@Preview()
@Composable
fun LanguageUI() {
    LanguageScreen()

}