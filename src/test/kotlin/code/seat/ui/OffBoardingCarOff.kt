package code.seat.ui

import net.serenitybdd.core.annotations.findby.By
import net.serenitybdd.screenplay.targets.Target

object OffBoardingCarOff {

    fun `the car is off`() : Target = Target.the("the car is off").located(
        By.id("seat.code.emobility.seatmo:id/car_off")
    )
}
