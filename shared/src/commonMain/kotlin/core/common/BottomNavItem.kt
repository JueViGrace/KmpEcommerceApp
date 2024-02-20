package core.common

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val index: UShort, val title: String, val icon: ImageVector) {
    data object DashboardNav : BottomNavItem(
        index = 0u,
        title = "Home",
        icon = Icons.Default.Home
    )
    data object ProductsNav : BottomNavItem(
        index = 1u,
        title = "Products",
        icon = Icons.Default.ShoppingBag
    )
    data object ProfileNav : BottomNavItem(
        index = 2u,
        title = "Profile",
        icon = Icons.Default.Person
    )
}
