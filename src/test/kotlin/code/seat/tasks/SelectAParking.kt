package code.seat.tasks

import code.seat.ui.MapScreen
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click
import net.thucydides.core.annotations.Step

open class SelectAParking : Task{

    @Step("{0} selects a parking")
    override fun <T : Actor> performAs(actor: T) {
        actor.attemptsTo(
            Click.on(MapScreen.MAP_PIN)
        )
    }

    fun theFirstFound(): SelectAParking {
       return SelectAParking()
    }
}
