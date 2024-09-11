package com.example.mysplashscreenanimated

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mysplashscreenanimated.ui.LottieAnimation.SplashScreen
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
