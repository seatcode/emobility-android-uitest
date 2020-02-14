package code.seat.ui

import io.appium.java_client.MobileBy
import net.serenitybdd.screenplay.targets.Target

object CarWindow{
    val BOOK_NOW : Target = Target.the("Book a car button").located(
        MobileBy.name("Book now")
    )
}