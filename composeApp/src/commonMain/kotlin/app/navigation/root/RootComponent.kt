package app.navigation.root

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.value.Value
import kotlinx.serialization.Serializable

class RootComponent(
    componentContext: ComponentContext
) : IRoot, ComponentContext by componentContext {
    private val navigation = StackNavigation<Config>()

    override val childStack: Value<ChildStack<*, IRoot.Child>> =
        childStack(
            source = navigation,
            serializer = Config.serializer(),
            initialConfiguration = Config.Auth,
            handleBackButton = true,
            childFactory = ::createChild
        )

    private fun createChild(config: Config, componentContext: ComponentContext): IRoot.Child =
        when (config) {
            Config.Auth -> TODO()
            Config.Hom -> TODO()
        }

//    private fun main(componentContext: ComponentContext): IMain = MainComponent(componentContext)

    @Serializable
    private sealed class Config {
        @Serializable
        data object Auth : Config()
        @Serializable
        data object Hom : Config()
    /*
        @Serializable
        data object Main : Config()*/
    }
}
