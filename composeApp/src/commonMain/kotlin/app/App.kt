package app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
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
            modifier = Modifier
                .fillMaxSize(),
        ) {
            Text(text = "hola")
        }
    }
}
