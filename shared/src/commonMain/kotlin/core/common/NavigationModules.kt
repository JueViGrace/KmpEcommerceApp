package core.common

import auth.navigation.AuthScreen
import cafe.adriel.voyager.core.screen.Screen
import home.navigation.HomeScreen

sealed class NavigationModules(val screen: Screen) {
    data object Auth : NavigationModules(
        screen = AuthScreen
    )
    data object Home : NavigationModules(
        screen = HomeScreen
    )
}
