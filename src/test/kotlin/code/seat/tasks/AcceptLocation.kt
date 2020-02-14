package code.seat.tasks

import code.seat.ui.AllowLocationWindow
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click
import net.thucydides.core.annotations.Step

open class AcceptLocation : Task {

    @Step("{0} enables location services")
    override fun <T : Actor> performAs(actor: T) {
        actor.attemptsTo(
            Click.on(AllowLocationWindow.ALLOW_WHILE_USING_THE_APP)
        )
    }

}
