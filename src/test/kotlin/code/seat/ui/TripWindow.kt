package code.seat.ui

import net.serenitybdd.core.annotations.findby.By
import net.serenitybdd.screenplay.targets.Target

object TripWindow {

    fun `accept damage report`() : Target = Target.the("accept damage report dialog").located(
        By.id("seat.code.emobility.seatmo:id/positive_view")
    )

    fun `finish the trip`() : Target = Target.the("finish the trip").located(
        By.id("seat.code.emobility.seatmo:id/trip_finish")
    )
}
