package code.seat.tasks

import code.seat.ui.ParkingWindow
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.Tasks.instrumented
import net.serenitybdd.screenplay.actions.Click
import net.thucydides.core.annotations.Step

open class SelectACar : Task{

    private var carName: String = "SEAT eMii"

    @Step("{0} selects a car")
    override fun <T : Actor> performAs(actor: T) {
        actor.attemptsTo(
            Click.on(ParkingWindow.CAR(carName))
        )
    }

    fun withName(carName: String): SelectACar {
        return instrumented(SelectACar::class.java,carName)
    }
}