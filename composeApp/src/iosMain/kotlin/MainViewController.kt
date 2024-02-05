import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.ui.window.ComposeUIViewController
import app.App

fun MainViewController() = ComposeUIViewController {
    App(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = false,
    )
}
