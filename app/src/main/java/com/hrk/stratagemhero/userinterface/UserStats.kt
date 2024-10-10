package com.hrk.stratagemhero.userinterface

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.hrk.stratagemhero.ui.theme.squaresFontFamily

@Composable
fun UserStats(round: Int, score: Int) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent)
            .padding(top = 24.dp, bottom = 16.dp, start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Top

    ) {
        Column (
            modifier = Modifier
                .background(Color.Transparent),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Round",
                fontFamily = squaresFontFamily,
                color = Color.White
            )
            Text(
                text = "$round",
                fontFamily = squaresFontFamily,
                color = Color(0xFFf7eb30),
                modifier = Modifier.padding(top = 4.dp)
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column (
            modifier = Modifier
                .background(Color.Transparent),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Score",
                fontFamily = squaresFontFamily,
                color = Color.White
            )
            Text(
                text = "$score",
                fontFamily = squaresFontFamily,
                color = Color(0xFFf7eb30),
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}