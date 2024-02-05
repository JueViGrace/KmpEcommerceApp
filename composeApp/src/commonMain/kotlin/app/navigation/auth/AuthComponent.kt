package app.navigation.auth

import com.arkivanov.decompose.ComponentContext

class AuthComponent(
    componentContext: ComponentContext
) : IAuth, ComponentContext by componentContext {


}
