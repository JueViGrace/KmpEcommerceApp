package home.navigation

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.TabDisposable
import cafe.adriel.voyager.navigator.tab.TabNavigator
import core.common.bottomList
import core.presentation.components.BottomBarComponent

object HomeScreen : Screen {
    override val key: ScreenKey = uniqueScreenKey

    @Composable
    override fun Content() {
        TabNavigator(
            tab = DashboardTab,
            tabDisposable = { tabNavigator ->
                TabDisposable(
                    navigator = tabNavigator,
                    tabs = bottomList
                )
            }
        ) { tabNavigator ->

            Scaffold(
                bottomBar = {
                    BottomBarComponent(tabNavigator)
                },
                content = { CurrentTab() }
            )
        }
    }
}
