package code.seat.steps

import code.seat.tasks.EndATrip
import cucumber.api.java.en.And
import net.serenitybdd.screenplay.actors.OnStage

open class OffBoardingSteps {

    @And("he can finish the trip")
    fun user_ends_the_trip(){
        OnStage.theActorInTheSpotlight().attemptsTo(
            EndATrip()
        )
    }
}
