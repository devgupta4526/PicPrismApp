package com.underground.picprism

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.underground.picprism.presentation.Home_Screen.HomeScreen
import com.underground.picprism.presentation.Home_Screen.HomeViewModel
import com.underground.picprism.presentation.theme.PicPrismTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PicPrismTheme {
                val viewModel = viewModel<HomeViewModel>()
                HomeScreen(images = viewModel.images)

            }
        }
    }
}

