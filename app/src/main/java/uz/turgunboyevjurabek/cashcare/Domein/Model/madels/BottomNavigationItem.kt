package uz.turgunboyevjurabek.cashcare.Domein.Model.madels

import android.icu.text.CaseMap.Title
import android.widget.QuickContactBadge
import androidx.compose.ui.graphics.painter.Painter

data class BottomNavigationItem (

    val selectedIcon:Painter,
    val unselectedIcon:Painter,
    val screenRout:String,
)