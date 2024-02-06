package app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import core.presentation.KmpEcommeceTheme
import home.navigation.HomeScreen

@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean = false
) {
    KmpEcommeceTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        Navigator(
            screen = HomeScreen()
        ) { navigator ->

            Scaffold { innerPadding ->
            }

            SlideTransition(navigator)
        }

        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            Text(text = "hola")
        }
    }
}
