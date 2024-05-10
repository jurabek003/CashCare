package uz.turgunboyevjurabek.cashcare.Prezentation.ViewScreens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun HorizontalDeptListUI() {

    Box(
        modifier = Modifier
            .width(135.dp)
            .height(200.dp)
            .clip(RoundedCornerShape(12.dp))
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = colorResource(id = R.color.color1)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = null,
                modifier = Modifier
                    .size(75.dp)


            )
            Text(
                text = "Ma’rufjon",
                fontWeight = FontWeight.Medium,
                fontSize = 15.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(2.dp)
            )
             Text(
                text = "2-dekabr, 2023",
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                color = Color.White,
                 modifier = Modifier
                     .padding(2.dp)
            )

            Box(
                modifier = Modifier
                    .height(33.dp)
                    .width(92.dp)
                    .clip(RoundedCornerShape(8.dp)),

            ){
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "-12 000 so’m",
                        fontSize = 10.sp,
                        color = colorResource(id = R.color.color_minus),
                    )
                }
            }

        }

    }

}

@Preview()
@Composable
private fun DeptUI() {
    HorizontalDeptListUI()

}