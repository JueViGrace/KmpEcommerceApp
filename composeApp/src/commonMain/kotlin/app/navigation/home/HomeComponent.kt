package app.navigation.home

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.Value

class HomeComponent(
    componentContext: ComponentContext
) : IHome, ComponentContext by componentContext {
    override val model: Value<IHome.Model>
        get() = TODO("Not yet implemented")
}