package code.seat.ui

import io.appium.java_client.MobileBy
import net.serenitybdd.screenplay.targets.Target

object MapScreen{
    val MAP_PIN : Target = Target.the("Parking Poi").located(
        MobileBy.name("Map pin")
    )
}