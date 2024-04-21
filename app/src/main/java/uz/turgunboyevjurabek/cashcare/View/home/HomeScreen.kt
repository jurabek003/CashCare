@file:OptIn(
    ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class
)

package uz.turgunboyevjurabek.cashcare.View.home

import android.annotation.SuppressLint
import android.app.ActionBar
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.turgunboyevjurabek.cashcare.Model.madels.BottomNavigationItem
import uz.turgunboyevjurabek.cashcare.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "AutoboxingStateCreation")
@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        val items = listOf(
            BottomNavigationItem(
                selectedIcon = painterResource(id = R.drawable.home_select),
                unselectedIcon = painterResource(id = R.drawable.home_select),
                screenRout = "HomeScreen",

            ),
            BottomNavigationItem(
                selectedIcon = painterResource(id = R.drawable.chart_unselect),
                unselectedIcon = painterResource(id = R.drawable.chart_unselect),
                screenRout = "ChartScreen",

            ),
            BottomNavigationItem(
                selectedIcon = painterResource(id = R.drawable.circle_plus),
                unselectedIcon = painterResource(id = R.drawable.circle_plus),
                screenRout = "AddScreen",

            ),
            BottomNavigationItem(
                selectedIcon = painterResource(id = R.drawable.vector),
                unselectedIcon = painterResource(id = R.drawable.vector),
                screenRout = "StoryScreen",

            ),
            BottomNavigationItem(
                selectedIcon = painterResource(id = R.drawable.settings),
                unselectedIcon = painterResource(id = R.drawable.settings),
                screenRout = "SettingsScreen",

            ),
        )

        Scaffold(
            modifier = Modifier
                .fillMaxSize(),
            topBar = {
            TopAppBar(title = {
                Text(text = "LOGO")
            }, actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_filter),
                        contentDescription = "filterButton",
                        modifier = Modifier
                            .height(26.dp)
                            .width(26.dp)
                    )
                }
                IconButton(onClick = { }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_search),
                        contentDescription = "filterButton",
                        modifier = Modifier
                            .height(26.dp)
                            .width(26.dp)
                    )
                } }
            )
},
            bottomBar = {
                var selectedTabIndex by rememberSaveable {
                    mutableStateOf(0)
                }

                NavigationBar {
                    items.forEachIndexed { index, bottomNavigationItem ->
                        NavigationBarItem(
                            selected = selectedTabIndex==index,
                            onClick = {
                                selectedTabIndex = index
                            },

                            icon = {
                                Icon(
                                    painter =bottomNavigationItem.selectedIcon,
                                    contentDescription =null,
                                    modifier = Modifier
                                        .size(if (index==2) 55.dp else 25.dp ),
                                    tint = if (selectedTabIndex==index)
                                        colorResource(id = R.color.color1)
                                    else colorResource(
                                        id = R.color.ic_unselect
                                    )
                                )
                            })
                    }
                }
            }

        ) { paddingValues ->
            Column(
                modifier = Modifier.padding(paddingValues)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier.height(120.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ellipse_bac),
                            contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(200.dp)
                                .wrapContentHeight()
                                .padding(15.dp)
                                .align(Alignment.Center)
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.Center),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "Umumiy qarzingiz",
                                fontSize = 12.sp,
                                modifier = Modifier.alpha(0.6f)
                            )
                            Row(
                                modifier = Modifier, horizontalArrangement = Arrangement.spacedBy(
                                    20.dp, alignment = Alignment.CenterHorizontally
                                ), verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "25 000 so’m",
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = colorResource(id = R.color.color1)
                                )
                                IconButton(onClick = { }) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.eye_on),
                                        contentDescription = "Eye on",
                                        modifier = Modifier.size(30.dp)
                                    )
                                }
                            }

                        }

                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Qarzdorlar", fontSize = 16.sp, fontWeight = FontWeight.Bold
                    )
                    TextButton(
                        onClick = {

                        }
                    ){
                        Text(
                            text = "Barchasi",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.color1)
                        )
                    }
                }

                LazyRow(
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    items(5){
                        HorizontalDeptListUI()
                    }
                }

            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeUI() {
    HomeScreen()
}

