package code.seat.tasks

import code.seat.ui.BookingConfirmationWindow
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click
import net.thucydides.core.annotations.Step

open class AcceptBookingFeedback : Task {

    @Step("{0} accepts booking confirmation")
    override fun<T : Actor> performAs(actor: T) {

        Thread.sleep(6000)

        actor.attemptsTo(
            Click.on(BookingConfirmationWindow.CONTINUE_BUTTON)
        )
    }
}
