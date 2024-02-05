package app.navigation.root

import app.navigation.auth.IAuth
import app.navigation.home.IHome
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value

interface IRoot {
    val childStack: Value<ChildStack<*, Child>>

    sealed class Child {
        data class Home(val component: IHome) : Child()
        data class Auth(val component: IAuth) : Child()
//        data class Main(val component: IMain) : Child()
    }
}
