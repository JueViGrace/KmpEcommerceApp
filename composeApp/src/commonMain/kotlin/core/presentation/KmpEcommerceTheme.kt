package core.presentation

import androidx.compose.runtime.Composable

@Composable
expect fun KmpEcommeceTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
)
