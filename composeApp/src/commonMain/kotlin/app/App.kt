package app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import core.presentation.KmpEcommeceTheme

@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean = false
) {
    KmpEcommeceTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            MainApp()
        }
    }
}
