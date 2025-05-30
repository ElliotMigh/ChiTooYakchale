package com.example.chitooyakhchale

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.example.chitooyakhchale.ui.theme.ChiTooYakhchaleTheme
import androidx.compose.material.Text
import androidx.compose.material.Surface
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import com.example.chitooyakhchale.ui.theme.SplashScreen
import com.example.chitooyakhchale.ui.theme.home.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var showSplash by remember { mutableStateOf(true) }

            ChiTooYakhchaleTheme {
                val color = MaterialTheme.colors.primary.toArgb()
                SideEffect {
                    window.statusBarColor = color
                }
                
                if (showSplash) {
                    SplashScreen (onTimeOut = {showSplash = false})
                } else {
                    HomeScreen()
                }
            }
        }
    }
}
