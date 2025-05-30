package com.example.chitooyakhchale.ui.theme

import android.media.Image
import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chitooyakhchale.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onTimeOut: () -> Unit) {
    LaunchedEffect(Unit) {
        delay(2000)
        onTimeOut()
    }

    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_what_is_in_the_frdige),
            contentDescription = "Splash Image",
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth(0.6f)
                .fillMaxHeight(0.6f),
            contentScale = ContentScale.Fit
        )
    }
}
