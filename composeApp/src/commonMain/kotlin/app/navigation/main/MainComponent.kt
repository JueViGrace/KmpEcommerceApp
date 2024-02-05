package app.navigation.main

import app.navigation.auth.AuthComponent
import app.navigation.auth.IAuth
import app.navigation.home.HomeComponent
import app.navigation.home.IHome
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.arkivanov.decompose.value.operator.map
import kotlinx.serialization.Serializable

class MainComponent(
    componentContext: ComponentContext
) : IMain, ComponentContext by componentContext {
    private val navigation = StackNavigation<Config>()

    private val _model = MutableValue(IMain.Model(selectedTab = IMain.Tab.Auth))
    override val model: Value<IMain.Model> = _model.map { state ->
        IMain.Model(selectedTab = state.selectedTab)
    }

    override val stack: Value<ChildStack<*, IMain.Child>> =
        childStack(
            source = navigation,
            serializer = Config.serializer(),
            initialConfiguration = Config.Auth,
            handleBackButton = true,
            childFactory = ::createChild
        )

    private fun createChild(config: Config, componentContext: ComponentContext): IMain.Child {
        return when (config){
            Config.Auth -> IMain.Child.Auth(
                component = auth(componentContext)
            )
            Config.Home -> IMain.Child.Home(
                component = home(componentContext)
            )
        }
    }

    private fun home(componentContext: ComponentContext): IHome = HomeComponent(componentContext)

    private fun auth(componentContext: ComponentContext): IAuth = AuthComponent(componentContext)

    @Serializable
    private sealed class Config {
        @Serializable
        data object Home : Config()
        @Serializable
        data object Auth : Config()
    }
}