package code.seat.tasks

import code.seat.ui.OffBoardingCarLocked
import code.seat.ui.OffBoardingCarOff
import code.seat.ui.OffBoardingParkingSpot
import code.seat.ui.TripWindow
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.actions.Enter
import net.thucydides.core.annotations.Step

open class EndATrip : Task {

    @Step("{0} will be redirected to offboarding process")
    override fun <T : Actor> performAs(actor: T) {

        Thread.sleep(800)

        actor.attemptsTo(
            Click.on(TripWindow.`finish the trip`())
        )

        actor.attemptsTo(
            Click.on(OffBoardingCarOff.`the car is off`())
        )

        Thread.sleep(1000)

        actor.attemptsTo(
            Click.on(OffBoardingCarLocked.`the car is closed`())
        )

        Thread.sleep(2000)

        actor.attemptsTo(
            Enter.theValue("1234").into(OffBoardingParkingSpot.slot_field())
        )

        Thread.sleep(1000)

        actor.attemptsTo(
            Click.on(OffBoardingParkingSpot.`send the parking spot`())
        )
    }
}
