package code.seat.ui

import io.appium.java_client.MobileBy
import net.serenitybdd.screenplay.targets.Target

object BookingConfirmationWindow {
    val BOOKING_CONFIRMATION_TEXT : Target = Target.the("Booking Confirmation text").located(
        MobileBy.name("Your car is successfully booked")
    )
}