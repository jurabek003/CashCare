package uz.turgunboyevjurabek.cashcare.View.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
            .width(100.dp)
            .height(160.dp)
            .clip(RoundedCornerShape(12.dp))
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = colorResource(id = R.color.color1)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp, alignment = Alignment.CenterVertically)
        ) {
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
            )
            Text(
                text = "Ma’rufjon",
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                color = Color.White
            )
             Text(
                text = "2-dekabr, 2023",
                fontWeight = FontWeight.Normal,
                fontSize = 10.sp,
                color = Color.White
            )

            Box(
                modifier = Modifier
                    .height(20.dp)
                    .width(76.dp)
                    .clip(RoundedCornerShape(7.dp))
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
                        fontSize = 8.sp,
                        color = colorResource(id = R.color.color_minus)
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