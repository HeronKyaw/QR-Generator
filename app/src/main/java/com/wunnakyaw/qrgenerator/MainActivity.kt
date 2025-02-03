package com.wunnakyaw.qrgenerator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.wunnakyaw.qrgenerator.ui.theme.QRGeneratorTheme
import com.wunnakyaw.qrgenerator.utils.AppRoutes
import com.wunnakyaw.qrgenerator.utils.Routes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QRGeneratorTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    // Call the AppRoutes composable to setup navigation.
                    AppRoutes(
                        startDestination = Routes.QR_LIST_SCREEN,
                        navController = navController
                    )
                }
            }
        }
    }
}