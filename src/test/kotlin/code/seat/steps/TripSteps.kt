package code.seat.steps

import code.seat.tasks.AcceptBookingFeedback
import code.seat.tasks.AcceptReportDamage
import code.seat.tasks.StartATrip
import cucumber.api.java.en.And
import cucumber.api.java.en.When
import net.serenitybdd.screenplay.actors.OnStage

open class TripSteps {

    @When("he goes to the car")
    fun user_starts_the_trip(){
        OnStage.theActorInTheSpotlight().attemptsTo(
            AcceptBookingFeedback(),
            StartATrip()
        )
    }

    @And("the car has no damages")
    fun user_accepts_report_damage(){
        OnStage.theActorInTheSpotlight().attemptsTo(
            AcceptReportDamage()
        )
    }
}
