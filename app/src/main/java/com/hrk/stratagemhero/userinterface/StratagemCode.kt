package com.hrk.stratagemhero.userinterface

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.hrk.stratagemhero.R

@Composable
fun StratagemCode(arrowSequence: String, visibleArrows: List<Boolean>, onArrowPressed: (Char) -> Unit) {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val arrowSize = screenWidth * 0.1f

    val arrowResources =  mapOf(
        'u' to R.drawable.u,
        'd' to R.drawable.d,
        'l' to R.drawable.l,
        'r' to R.drawable.r
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(arrowSize)
            .padding(bottom = 8.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Top,
    ) {
        for(index in arrowSequence.indices) {
            if (visibleArrows[index]) {
                val arrowChar = arrowSequence[index]
                val arrowResource = arrowResources[arrowChar]
                if (arrowResource != null) {
                    Image(
                        painter = painterResource(arrowResource),
                        contentDescription = "arrow",
                        modifier = Modifier
                            .size(arrowSize)
                            .clickable {
                                onArrowPressed(arrowChar)
                            }
                    )
                }
            }

        }
    }
}