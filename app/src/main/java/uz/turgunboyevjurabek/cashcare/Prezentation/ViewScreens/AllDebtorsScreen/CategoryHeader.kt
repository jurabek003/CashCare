package uz.turgunboyevjurabek.cashcare.Prezentation.ViewScreens.AllDebtorsScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CategoryHeader(
    text: String,
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .background(color = MaterialTheme.colorScheme.background )
//if (isSystemInDarkTheme()) Color.Black else Color.White
) {
    Text(
        text = text,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    )
}
