package auth.navigation

import androidx.compose.runtime.Composable
import auth.login.presentation.ui.LoginContent
import cafe.adriel.voyager.core.annotation.InternalVoyagerApi
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import core.common.AuthScreens
import core.common.NavigationModules
import core.presentation.navigation.AppScreen

object LoginScreen : Screen {
    override val key: ScreenKey = uniqueScreenKey

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        LoginContent(
            navigateToRegister = {
                navigator.push(AuthScreens.Register.screen)
            },
            navigateToHome = {
                navigator.replaceAll(AppScreen(initialScreen = NavigationModules.Home.screen))
            }
        )
    }
}
