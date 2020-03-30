package code.seat.tasks

import code.seat.ui.*
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click
import net.thucydides.core.annotations.Step

open class StartATrip : Task {

    @Step("{0} goes to the car")
    override fun <T : Actor> performAs(actor: T) {
        Thread.sleep(2000)

        actor.attemptsTo(
            Click.on(PreTripWindow.`i'm next to the car button`())
        )
    }
}
