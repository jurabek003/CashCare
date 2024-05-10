package uz.turgunboyevjurabek.cashcare.Prezentation.ViewScreens.AllDebtorsScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.turgunboyevjurabek.cashcare.Domein.Model.madels.Category
import uz.turgunboyevjurabek.cashcare.R

@Composable
 fun CategoryItem(
    text: String,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 15.dp, horizontal = 20.dp)
            .height(70.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = null,
                modifier = Modifier
                    .size(70.dp)
                    .padding(5.dp)
            )
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(0.8f)
                    .padding(vertical = 7.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ){
                Text(
                    text = text,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .width(130.dp),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,

                )
                Text(
                    text = "Qarz muddati 30.03.2024",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .alpha(0.6f)
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(7.dp)
                    .weight(0.5f),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "+25 000 so’m",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(Alignment.End)
                )
                Text(
                    text = "28/03/2024",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .alpha(0.6f)
                        .align(Alignment.End)
                )
            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CategoryItemUI() {
    CategoryItem(text = "Androidchi Jurabek")

    
}