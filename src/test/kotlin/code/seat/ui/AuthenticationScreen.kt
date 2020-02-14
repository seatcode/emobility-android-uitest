package code.seat.ui

import io.appium.java_client.MobileBy
import net.serenitybdd.screenplay.targets.Target

object AuthenticationScreen{
    val LOGIN_OPTION_BUTTON : Target = Target.the("Login option button").located(
        MobileBy.name("Login")
    )
}