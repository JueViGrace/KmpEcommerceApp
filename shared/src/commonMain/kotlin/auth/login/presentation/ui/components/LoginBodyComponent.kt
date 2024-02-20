package auth.login.presentation.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import core.presentation.components.CustomCard
import core.presentation.components.CustomText
import core.presentation.components.EmailComponent
import core.presentation.components.PasswordComponent

@Composable
fun LoginBodyComponent() {
    var emailValue by rememberSaveable {
        mutableStateOf("")
    }
    var passwordValue by rememberSaveable {
        mutableStateOf("")
    }

    CustomCard(
        modifier = Modifier
            .widthIn(min = 200.dp, max = 500.dp)
            .padding(PaddingValues(5.dp)),
        shape = CardDefaults.outlinedShape,
        border = BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.onBackground)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalArrangement = Arrangement
                .spacedBy(
                    space = 5.dp,
                    alignment = Alignment.CenterVertically
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CustomText(
                text = "Bienvenido",
                fontWeight = FontWeight.Bold,
                textSize = 20
            )
            CustomText(
                text = "accede a tu cuenta",
                fontWeight = FontWeight.Bold,
                textSize = 20
            )

            EmailComponent(
                modifier = Modifier.fillMaxWidth(),
                value = emailValue,
                newValue = { newValue ->
                    emailValue = newValue
                },
                errorStatus = false
            )

            PasswordComponent(
                modifier = Modifier.fillMaxWidth(),
                value = passwordValue,
                newValue = { newValue ->
                    passwordValue = newValue
                },
                errorStatus = false
            )
        }
    }
}
