package home.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import core.common.BottomNavItem
import home.dashboard.presentation.ui.DashboardScreen

object DashboardTab : Tab {
    override val key: ScreenKey = uniqueScreenKey

    override val options: TabOptions
        @Composable
        get() {
            val icon = rememberVectorPainter(BottomNavItem.DashboardNav.icon)
            return remember {
                TabOptions(
                    index = BottomNavItem.DashboardNav.index,
                    title = BottomNavItem.DashboardNav.title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        DashboardScreen()
    }
}
