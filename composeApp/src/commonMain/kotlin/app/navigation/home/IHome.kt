package app.navigation.home

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value

interface IHome {
    val stack: Value<ChildStack<*, Child>>
    val model: Value<Model>

    data class Model(
        val item: String
    )

    sealed class Child {
    }
}
