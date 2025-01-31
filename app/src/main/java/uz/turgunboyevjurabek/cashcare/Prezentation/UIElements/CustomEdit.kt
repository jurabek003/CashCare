@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)

package uz.turgunboyevjurabek.cashcare.Prezentation.UIElements

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.turgunboyevjurabek.cashcare.Prezentation.MaskVisualTransformation
import uz.turgunboyevjurabek.cashcare.R

@Composable
fun CustomEdit(): String {
    var text by remember {
        mutableStateOf("")
    }

    val mask = MaskVisualTransformation("##-###-##-##")
    val focusRequester = remember {
        FocusRequester()
    }

    var inputIsFocused by remember {
        mutableStateOf(false)
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .clip(RoundedCornerShape(10.dp))
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(id = R.color.edtColor)),
            verticalAlignment = Alignment.CenterVertically,
        ) {

            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = "+998 |",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.width(5.dp))
            BasicTextField(
                keyboardActions = KeyboardActions.Default,
                value = text,
                onValueChange = { it ->
                    if (it.length <= 9) {
                        text = it.filter { it.isDigit() }
                    }
                },
                textStyle = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.SemiBold),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                maxLines = 1,
                visualTransformation = mask,
                modifier = Modifier
                    .focusRequester(focusRequester)
                    .onFocusChanged { inputIsFocused = it.isFocused }
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth(),
            )
        }
    }
    return text
}


@Preview(showSystemUi = true)
@Composable
private fun UIEdt() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        CustomEdit()
        PinView()
        NameEdit()
    }
}

@Composable
fun NameEdit():String {
    var text by remember {
        mutableStateOf("")
    }
    val focusRequester = remember {
        FocusRequester()
    }

    var inputIsFocused by remember {
        mutableStateOf(false)
    }

    TextField(
        keyboardActions = KeyboardActions.Default,
        value = text,
        onValueChange = { it ->
            text = it
        },
        placeholder = {
            Text(
                text = "Ism",
                color = Color.Black,
                modifier = Modifier.alpha(0.4f),
                fontSize = 18.sp
            )
        },
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
        ),
        shape = RoundedCornerShape(10.dp),
        textStyle = TextStyle(
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black
        ),
        maxLines = 1,
        singleLine = true,
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
            .padding(horizontal = 20.dp)
            .focusRequester(focusRequester)
            .onFocusChanged { inputIsFocused = it.isFocused }

    )
    return text
}

@Composable
fun PinView() {
    var text by remember {
        mutableStateOf("")
    }

    BasicTextField(
        value = text,
        onValueChange = {
            if (it.length <= 4) {
                text = it
            }
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.NumberPassword,
            autoCorrect = true
        ),
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            repeat(4) { index ->
                val number = when {
                    index >= text.length -> ""
                    else -> text[index]
                }
                Box(
                    modifier = Modifier
                        .height(52.dp)
                        .width(40.dp)
                        .clip(RoundedCornerShape(10.dp))
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(colorResource(id = R.color.edtColor)),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(
                            text = number.toString(),
                            color = Color.Black,
                            fontSize = 18.sp
                        )
                    }
                }
            }
        }
    }

}