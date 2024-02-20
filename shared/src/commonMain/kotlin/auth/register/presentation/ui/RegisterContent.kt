package auth.register.presentation.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ElevatedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import core.presentation.components.CustomText

@Composable
fun RegisterContent(
    navigateToLogin: () -> Unit,
    navigateToTerms: () -> Unit,
    navigateToHome: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ElevatedButton(
            onClick = {
                navigateToLogin()
            }
        ) {
            CustomText(text = "Login")
        }

        ElevatedButton(
            onClick = {
                navigateToHome()
            }
        ) {
            CustomText(text = "Home")
        }
        ElevatedButton(
            onClick = {
                navigateToTerms()
            }
        ) {
            CustomText(text = "Terms")
        }
    }
}
