package code.seat.ui

import io.appium.java_client.MobileBy
import net.serenitybdd.screenplay.targets.Target

object LoginScreen {
    val LOGIN_FORM_BUTTON: Target = Target.the("Login form submit button").located(
        MobileBy.name("lel")
    )
    val LOGIN_FORM_PASSWORD: Target = Target.the("Login Password input text").located(
        MobileBy.name("lal")
    )

    val LOGIN_FORM_EMAIL : Target = Target.the("Login Email text input").located(
        MobileBy.name("lol")
    )


}
