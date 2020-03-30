package code.seat.ui

import net.serenitybdd.core.annotations.findby.By
import net.serenitybdd.screenplay.targets.Target

object OffBoardingCarLocked {

    fun `the car is closed`() : Target = Target.the("the car is closed").located(
        By.id("seat.code.emobility.seatmo:id/bottom_sheet_right_button")
    )
}