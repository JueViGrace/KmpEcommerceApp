package core.presentation.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun EmailComponent(
    modifier: Modifier,
    value: String,
    newValue: (String) -> Unit,
    errorStatus: Boolean = false
) {
    CustomOutlinedTextField(
        modifier = modifier,
        value = value,
        onValueChanged = { output ->
            newValue(output)
        },
        label = {
            CustomText(text = "email")
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next
        ),
        placeholder = {
            CustomText(text = "email")
        },
        leadingIcon = {
            Icon(imageVector = Icons.Filled.Email, contentDescription = "email")
        },
        isError = !errorStatus
    )
}