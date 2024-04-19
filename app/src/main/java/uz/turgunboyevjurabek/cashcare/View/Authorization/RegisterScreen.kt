package uz.turgunboyevjurabek.cashcare.View.Authorization

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
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
import uz.turgunboyevjurabek.cashcare.Model.madels.RegionName
import uz.turgunboyevjurabek.cashcare.R
import uz.turgunboyevjurabek.cashcare.View.UIElements.CustomEdit
import uz.turgunboyevjurabek.cashcare.View.UIElements.NameEdit

@Composable
fun RegisterScreen(navController: NavController) {
    var userName by remember {
        mutableStateOf("")
    }

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
                .padding(top = 10.dp)
                .weight(0.5f)
                .align(Alignment.CenterHorizontally)
        ){
            Image(
                painter = painterResource(id = R.drawable.ic_ellipse2),
                contentDescription = null,
                modifier = Modifier
                    .size(20.dp)
            )
            Text(
                text = "Ro’yxatdan o’ting",
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
            ,
        ) {
            Text(
                text = "Ismingizni kiriting",
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(start = 20.dp)
            )
            userName=NameEdit()
            SelectRegionCard()
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
                    .padding(20.dp)
                    .height(45.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor =  if (userName != ""){
                        colorResource(id = R.color.bacUI)
                    }else{
                        Color.Cyan
                    },
                ),
                onClick = {

                }) {
                Text(text = "Boshlash", fontSize = 12.sp)
            }

        }


    }
}

@Composable
fun SelectRegionCard():String {
    var expendedState by remember {
        mutableStateOf(false)
    }

    val rotationState by animateFloatAsState(
        if (expendedState) 180f else 0f, label = ""
    )

    var selectRegionName by remember {
        mutableStateOf("Viloyatni tanlash")
    }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 20.dp)

    ) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = selectRegionName,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(vertical = 10.dp)
                )
                IconButton(
                    onClick = { expendedState = !expendedState },
                    modifier = Modifier
                        .alpha(0.8f)
                        .rotate(rotationState)

                ) {
                    Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null)
                }
            }
            val list=ArrayList<RegionName>()
            list.addAll(listOf(
                RegionName("Farg'ona"),
                RegionName("Andijon"),
                RegionName("Namangan"),
                RegionName("Jizzax"),
                RegionName("Xorazm"),
                RegionName("Samarqand"),
                RegionName("Toshkent"),
                RegionName("Guliston"),
                RegionName("Sirdaryo"),
                RegionName("Qashqadaryo"),
                RegionName("Nukus"),
                RegionName("Xiva"),
            ))
            if (expendedState){
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                ) {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        items(list.size){
                            Box(
                                Modifier
                                    .clip(RoundedCornerShape(20.dp))
                                    .fillMaxWidth()
                                    .height(40.dp)
                            ){
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .clickable {
                                            selectRegionName = list[it].name
                                        },
                                ) {
                                    Text(
                                        text = list[it].name,
                                        fontWeight = FontWeight.W500,
                                        fontSize = 13.sp,
                                        modifier = Modifier
                                            .padding(start = 10.dp)
                                    )
                                    HorizontalDivider(modifier = Modifier
                                        .height(1.dp)
                                        .padding(5.dp)
                                        .fillMaxWidth()
                                    )
                                }
                            }
                        }
                    }
                }

            }
        }
    }
    return selectRegionName
}

@Preview(showSystemUi = true)
@Composable
private fun UIRegister() {
    val navController= rememberNavController()
    RegisterScreen(navController = navController)
    
}