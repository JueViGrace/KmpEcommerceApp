package home.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import core.common.BottomNavItem
import home.products.presentation.ui.ProductsScreen

object ProductsTab : Tab {
    override val key: ScreenKey = uniqueScreenKey

    override val options: TabOptions
        @Composable
        get() {
            val icon = rememberVectorPainter(BottomNavItem.ProductsNav.icon)
            return remember {
                TabOptions(
                    index = BottomNavItem.ProductsNav.index,
                    title = BottomNavItem.ProductsNav.title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        ProductsScreen()
    }
}
