package auth.navigation

import androidx.compose.runtime.Composable
import auth.register.presentation.ui.RegisterContent
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import core.common.AuthScreens
import core.presentation.navigation.AppScreen
import core.common.NavigationModules

object RegisterScreen : Screen {
    override val key: ScreenKey = uniqueScreenKey

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        RegisterContent(
            navigateToLogin = {
                navigator.takeIf { it.canPop }?.let { nav ->
                    run {
                        nav.pop()
                    }
                }
            },
            navigateToTerms = {
                navigator.push(AuthScreens.Terms.screen)
            },
            navigateToHome = {
                navigator.replaceAll(AppScreen(initialScreen = NavigationModules.Home.screen))
            }
        )
    }
}
