package app.navigation.main

import app.navigation.auth.IAuth
import app.navigation.home.IHome
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value

interface IMain {
    val stack: Value<ChildStack<*, Child>>
    val model: Value<Model>

    data class Model(
        val selectedTab: Tab = Tab.Auth
    )

    enum class Tab {
        Auth, Home
    }

    sealed class Child {
        data class Home(val component: IHome) : Child()
        data class Auth(val component: IAuth) : Child()
    }
}
