package com.example.mysplashscreenanimated

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.mysplashscreenanimated.ui.Navigation.Navigation
import com.example.mysplashscreenanimated.ui.theme.MySplashScreenAnimatedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MySplashScreenAnimatedTheme {
                Surface(
                    color = Color.White,
                    modifier = Modifier.fillMaxSize()
                ){
                    Navigation()
                }
            }
        }
    }
}
