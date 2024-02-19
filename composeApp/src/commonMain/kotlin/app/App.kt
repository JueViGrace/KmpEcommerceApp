package app

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
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
        Navigator(
            screen = AppScreen(
//                initialScreen =
            )
        ) { navigator ->
            SlideTransition(navigator = navigator)
        }
    }
}
