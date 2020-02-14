package code.seat.tasks

import code.seat.ui.CarWindow
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click
import net.thucydides.core.annotations.Step

open class BookACar : Task {

    @Step("{0} presses book a car button")
    override fun <T : Actor> performAs(actor: T) {
        actor.attemptsTo(
            Click.on(CarWindow.BOOK_NOW)
        )
    }

}
