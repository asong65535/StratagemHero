package com.hrk.stratagemhero.userinterface

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hrk.stratagemhero.utils.*

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

    var numberCorrectArrows: Int by remember { mutableStateOf(0) }

    var isPerfect: Boolean by remember { mutableStateOf(false)}

    var timeLeft: Int by remember { mutableStateOf(0) }

    var userRound: Int by remember { mutableStateOf(1)}

    var userScore: Int by remember { mutableStateOf(calculateScore(numberCorrectArrows, timeLeft, userRound - 1, isPerfect)) }


    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        UserStats(userRound, userScore)
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