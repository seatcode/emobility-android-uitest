package code.seat.tasks

import code.seat.model.credentials.Credentials
import code.seat.model.credentials.validCredentials
import code.seat.ui.AuthenticationScreen
import code.seat.ui.LoginScreen
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.Tasks.instrumented
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.actions.Enter
import net.thucydides.core.annotations.Step

open class Login : Task {

    private var credentials : Credentials = Credentials("thetestisalie@test.com","noC4k342")

    @Step("{0} logins with {String}")
    override fun <T: Actor> performAs(actor: T){
        actor.attemptsTo(
            Click.on(AuthenticationScreen.LOGIN_OPTION_BUTTON),
            Enter.theValue(credentials.userEmail).into(LoginScreen.LOGIN_FORM_EMAIL),
            Enter.theValue(credentials.userPassword).into(LoginScreen.LOGIN_FORM_PASSWORD),
            Click.on(LoginScreen.LOGIN_FORM_BUTTON)
        )
    }

    fun withValidCredentials(): Login {
        return instrumented(Login::class.java,validCredentials())
    }

}


