package core.common

import auth.navigation.LoginScreen
import auth.navigation.RegisterScreen
import auth.navigation.TermsScreen
import cafe.adriel.voyager.core.screen.Screen

sealed class AuthScreens(val screen: Screen) {
    data object Login : AuthScreens(
        screen = LoginScreen
    )
    data object Register : AuthScreens(
        screen = RegisterScreen
    )
    data object Terms : AuthScreens(
        screen = TermsScreen
    )
}
