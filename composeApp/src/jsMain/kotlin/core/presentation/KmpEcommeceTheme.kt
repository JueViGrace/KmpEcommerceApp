package core.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import app.theme.DarkColorScheme
import app.theme.LightColorScheme
import app.theme.Typography

@Composable
actual fun KmpEcommeceTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
