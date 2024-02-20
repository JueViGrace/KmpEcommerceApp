package app

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import core.common.NavigationModules
import core.presentation.navigation.AppScreen

@Composable
fun MainApp() {
    Navigator(
        screen = AppScreen(
            initialScreen = NavigationModules.Auth.screen
        )
    ) { navigator ->
        SlideTransition(navigator)
    }
}
