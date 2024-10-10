package com.hrk.stratagemhero.userinterface

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GameScreen() {
    val arrowSequence = "uulr"
    val visibleArrows = remember { mutableStateOf(List(arrowSequence.length) { true }) }

    val handleArrowPressed: (Char) -> Unit = { pressedArrow ->
        val nextArrowIndex = visibleArrows.value.indexOfFirst { it }
        if (nextArrowIndex != -1 && arrowSequence[nextArrowIndex] == pressedArrow) {
            // Mark the arrow as invisible
            visibleArrows.value = visibleArrows.value.toMutableList().apply {
                this[nextArrowIndex] = false
            }
            println("Correct arrow pressed: $pressedArrow")
        } else {
            println("Incorrect arrow pressed: $pressedArrow")
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        UserStats(1, 1)
        MainStratagem()
        Spacer(
            modifier = Modifier.height(8.dp)
        )
        SubStratagem()
        StratagemName()
        StratagemCode(arrowSequence, visibleArrows.value, handleArrowPressed)
        TimerBar(10)
        Spacer(modifier = Modifier.weight(1f))
        KeyPad(onArrowPressed = handleArrowPressed)
        // Do something with the pressed character

    }
}