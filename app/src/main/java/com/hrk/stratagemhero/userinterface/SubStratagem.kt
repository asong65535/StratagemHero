package com.hrk.stratagemhero.userinterface

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.hrk.stratagemhero.R

@Composable
fun SubStratagem() {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val stratSize = screenWidth * 0.15f
    val iconOpacity = 0.5f

    Row(
        modifier = Modifier
            //.align(Alignment.BottomEnd)
            .fillMaxWidth()
            .padding(start = 4.dp, end = 4.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom
    ) {
        Image(
            painter = painterResource(R.drawable.hanger_eagle_500kg_bomb),
            contentDescription = "500kg Bomb",
            modifier = Modifier
                .size(stratSize)
                .align(Alignment.Bottom)
                .alpha(iconOpacity)
        )
        Spacer(
            modifier = Modifier.width(4.dp)
        )
        Image(
            painter = painterResource(R.drawable.pac_recoilless_rifle),
            contentDescription = "Recoilless Rifle",
            modifier = Modifier
                .size(stratSize)
                .align(Alignment.Bottom)
                .alpha(iconOpacity)
        )
        Spacer(
            modifier = Modifier.width(4.dp)
        )
        Image(
            painter = painterResource(R.drawable.pac_recoilless_rifle),
            contentDescription = "Recoilless Rifle",
            modifier = Modifier
                .size(stratSize)
                .align(Alignment.Bottom)
                .alpha(iconOpacity)
        )
        Spacer(
            modifier = Modifier.width(4.dp)
        )
        Image(
            painter = painterResource(R.drawable.pac_recoilless_rifle),
            contentDescription = "Recoilless Rifle",
            modifier = Modifier
                .size(stratSize)
                .align(Alignment.Bottom)
                .alpha(iconOpacity)
        )
        Spacer(
            modifier = Modifier.width(4.dp)
        )
        Image(
            painter = painterResource(R.drawable.pac_recoilless_rifle),
            contentDescription = "Recoilless Rifle",
            modifier = Modifier
                .size(stratSize)
                .align(Alignment.Bottom)
                .alpha(iconOpacity)
        )
        Spacer(
            modifier = Modifier.width(4.dp)
        )
        Image(
            painter = painterResource(R.drawable.pac_recoilless_rifle),
            contentDescription = "Recoilless Rifle",
            modifier = Modifier
                .size(stratSize)
                .align(Alignment.Bottom)
                .alpha(iconOpacity)
        )
    }
}