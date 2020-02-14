package code.seat.ui

import io.appium.java_client.MobileBy
import net.serenitybdd.screenplay.targets.Target

object ParkingWindow{

    fun CAR(CarName: String) : Target =  Target.the("Seat Leon").located(
        MobileBy.name(CarName)
    )
}