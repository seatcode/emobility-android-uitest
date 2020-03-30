package code.seat.ui

import net.serenitybdd.core.annotations.findby.By
import net.serenitybdd.screenplay.targets.Target

object OffBoardingParkingSpot {

    fun `slot_field`() : Target = Target.the("user send the parking spot").located(
        By.id("seat.code.emobility.seatmo:id/slot_code")
    )

    fun `send the parking spot`() : Target = Target.the("user send the parking spot").located(
        By.id("seat.code.emobility.seatmo:id/send")
    )
}