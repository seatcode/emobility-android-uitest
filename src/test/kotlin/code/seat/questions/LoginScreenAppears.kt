package code.seat.questions

import code.seat.ui.LoginScreen
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Question

class LoginScreenAppears : Question<Boolean> {

    override fun answeredBy(actor: Actor): Boolean {
        return LoginScreen.LOGIN_FORM_BUTTON.resolveFor(actor).isCurrentlyVisible
    }
}
