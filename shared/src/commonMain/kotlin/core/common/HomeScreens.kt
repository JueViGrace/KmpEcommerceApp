package core.common

import cafe.adriel.voyager.core.screen.Screen
import home.navigation.DashboardTab

sealed class HomeScreens(val screen: Screen) {
    data object DashBoard : HomeScreens(
        screen = DashboardTab
    )
    data object Products : HomeScreens(
        screen = DashboardTab
    )
    data object Profile : HomeScreens(
        screen = DashboardTab
    )
}
