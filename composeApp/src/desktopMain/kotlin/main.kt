import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import app.App

fun main() {
    application {
        val windowState = rememberWindowState()

        Window(
            onCloseRequest = ::exitApplication,
            state = windowState,
            title = "KMP E-commerce"
        ) {
            App(
                darkTheme = isSystemInDarkTheme(),
                dynamicColor = false
            )
        }
    }
}
