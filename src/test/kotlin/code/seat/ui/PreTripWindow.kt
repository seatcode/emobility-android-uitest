package code.seat.ui

import net.serenitybdd.core.annotations.findby.By
import net.serenitybdd.screenplay.targets.Target


object PreTripWindow {

    fun `i'm next to the car button`() : Target = Target.the("i'm next to the car").located(
        By.id("seat.code.emobility.seatmo:id/nex_to_car")
    )

    fun `cancel reservation`() : Target = Target.the("i'm next to the car").located(
        By.id("seat.code.emobility.seatmo:id/cancel")
    )
}
