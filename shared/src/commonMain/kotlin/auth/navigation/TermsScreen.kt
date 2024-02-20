package auth.navigation

import androidx.compose.runtime.Composable
import auth.terms.presentation.ui.TermsContent
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey

object TermsScreen : Screen {
    override val key: ScreenKey = uniqueScreenKey
    @Composable
    override fun Content() {
        TermsContent(
            popBack = {}
        )
    }
}
