@file:OptIn(ExperimentalMaterial3Api::class)

package uz.turgunboyevjurabek.cashcare.Prezentation.ViewScreens

import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import uz.turgunboyevjurabek.cashcare.Domein.ViewModel.CalendarViewModel
import uz.turgunboyevjurabek.cashcare.Prezentation.calendar.CalendarWidget
import uz.turgunboyevjurabek.cashcare.Prezentation.utils.DateUtil
import uz.turgunboyevjurabek.cashcare.R

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun AllDebtorsScreen(navController: NavController) {
    Scaffold(modifier = Modifier.fillMaxSize(), topBar = {
        CenterAlignedTopAppBar(title = {
            Text(
                text = "Barchasi", fontWeight = FontWeight.Medium
            )
        }, navigationIcon = {
            IconButton(onClick = {
                if (navController.currentBackStackEntry?.lifecycle?.currentState == Lifecycle.State.RESUMED){
                    navController.popBackStack()
                }
            }) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
            }
        }, actions = {
            IconButton(onClick = { }) {
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
            }
        })

    }) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            CalendarView()


        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview
@Composable
private fun DebtorsUI() {
    val rememberNavController = rememberNavController()
    AllDebtorsScreen(rememberNavController)
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun CalendarView(
    viewModel: CalendarViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
    ) {
    val uiState by viewModel.uiState.collectAsState()
    val context= LocalContext.current
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight(unbounded = true)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(id = R.color.color1))
        ) {
            CalendarWidget(
                days = DateUtil.daysOfWeek,
                yearMonth = uiState.yearMonth,
                dates = uiState.dates,
                onPreviousMonthButtonClicked = { prevMonth ->
                    viewModel.toPreviousMonth(prevMonth)
                },
                onNextMonthButtonClicked = { nextMonth ->
                    viewModel.toNextMonth(nextMonth)
                },
                onDateClickListener = {
                    Toast.makeText(context, it.dayOfMonth, Toast.LENGTH_SHORT).show()
                }
            )


        }
    }
}

