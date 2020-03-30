package code.seat.tasks

import code.seat.ui.TripWindow
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click
import net.thucydides.core.annotations.Step

open class AcceptReportDamage : Task {

    @Step("{0} does the damage report")
    override fun <T : Actor> performAs(actor: T) {
        Thread.sleep(2500)

        actor.attemptsTo(
            Click.on(TripWindow.`accept damage report`())
        )
    }
}

