import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.lifecycle.LifecycleController
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import app.App

@OptIn(ExperimentalDecomposeApi::class)
fun main() {
    val lifecycle = LifecycleRegistry()

    application {
        val windowState = rememberWindowState()

        LifecycleController(lifecycle, windowState = windowState)

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
