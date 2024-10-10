package com.hrk.stratagemhero.userinterface

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun TimerBar(totalTime: Int) {
    var remainingTime by remember { mutableStateOf(totalTime) }
    val percentageRemaining by animateFloatAsState(
        targetValue = remainingTime / totalTime.toFloat(),
        animationSpec = tween(
            durationMillis = 1000, // 1 second per decrement
            easing = LinearEasing
        )
    )

    LaunchedEffect(remainingTime) {
        while(remainingTime > 0) {
            delay(1000L)
            remainingTime--
        }
    }

    Box(
        modifier = Modifier
            .height(30.dp)
            .fillMaxWidth()
            .background(Color.Black)


    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(percentageRemaining)
                .background(Color(0xFFf7eb30))
        )
    }
}