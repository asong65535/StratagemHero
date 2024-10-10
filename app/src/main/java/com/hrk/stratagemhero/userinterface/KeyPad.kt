package com.hrk.stratagemhero.userinterface

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.hrk.stratagemhero.R

@Composable
fun KeyPad(onArrowPressed: (Char) -> Unit) {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val arrowSize = screenWidth * 0.33f

    val isUpPressed = remember { mutableStateOf(false) }
    val isDownPressed = remember { mutableStateOf(false) }
    val isLeftPressed = remember { mutableStateOf(false) }
    val isRightPressed = remember { mutableStateOf(false) }

    val invertedColorMatrix = ColorMatrix(
        floatArrayOf(
            -1f, 0f, 0f, 0f, 255f, // Red channel inversion
            0f, -1f, 0f, 0f, 255f, // Green channel inversion
            0f, 0f, -1f, 0f, 255f, // Blue channel inversion
            0f, 0f, 0f, 1f, 0f    // Alpha channel (unchanged)
        )
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(bottom = 36.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.u),
                contentDescription = "up arrow",
                colorFilter = if (isUpPressed.value) {
                    ColorFilter.colorMatrix(invertedColorMatrix)
                } else null,
                modifier = Modifier
                    .size(arrowSize)
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onPress = {
                                isUpPressed.value = true
                                tryAwaitRelease()
                                isUpPressed.value = false
                                onArrowPressed('u')
                            }
                        )
                    }
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = painterResource(R.drawable.l),
                contentDescription = "left arrow",
                colorFilter = if (isLeftPressed.value) {
                    ColorFilter.colorMatrix(invertedColorMatrix)
                } else null,
                modifier = Modifier
                    .size(arrowSize)
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onPress = {
                                isLeftPressed.value = true
                                tryAwaitRelease()
                                isLeftPressed.value = false
                                onArrowPressed('l')
                            }
                        )
                    }
            )
            Image(
                painter = painterResource(R.drawable.d),
                contentDescription = "down arrow",
                colorFilter = if (isDownPressed.value) {
                    ColorFilter.colorMatrix(invertedColorMatrix)
                } else null,
                modifier = Modifier
                    .size(arrowSize)
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onPress = {
                                isDownPressed.value = true
                                tryAwaitRelease()
                                isDownPressed.value = false
                                onArrowPressed('d')
                            }
                        )
                    }
            )
            Image(
                painter = painterResource(R.drawable.r),
                contentDescription = "right arrow",
                colorFilter = if (isRightPressed.value) {
                    ColorFilter.colorMatrix(invertedColorMatrix)
                } else null,
                modifier = Modifier
                    .size(arrowSize)
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onPress = {
                                isRightPressed.value = true
                                tryAwaitRelease()
                                isRightPressed.value = false
                                onArrowPressed('r')
                            }
                        )
                    }
            )
        }
    }

}