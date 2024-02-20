package core.presentation.components

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.tab.TabNavigator
import core.common.bottomList

@Composable
fun BottomBarComponent(tabNavigator: TabNavigator) {
    val currentRoute = tabNavigator.current.key
    BottomAppBar {
        bottomList.forEach { tab ->
            val selected = currentRoute == tab.key
            NavigationBarItem(
                selected = selected,
                onClick = {
                    tabNavigator.current = tab
                },
                icon = {
                    Icon(
                        painter = tab.options.icon!!,
                        contentDescription = tab.options.title,
                    )
                },
                label = {
                    CustomText(text = tab.options.title)
                }
            )
        }
    }
}
