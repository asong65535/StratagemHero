package com.hrk.stratagemhero.userinterface

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hrk.stratagemhero.ui.theme.squaresFontFamily

@Composable
fun StratagemName() {
    Text(
        text = "Orbital Precision Strike",
        textAlign = TextAlign.Center,
        fontFamily = squaresFontFamily,
        color = Color.White,
        fontSize = 24.sp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, bottom = 8.dp)
    )
}