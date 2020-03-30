package code.seat.steps

import code.seat.questions.CarIsBooked
import code.seat.tasks.Login
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import net.serenitybdd.screenplay.actors.OnStage

class AuthenticationSteps{

    @When("he login with valid credentials")
    fun user_login(){

        OnStage.theActorInTheSpotlight().attemptsTo(
            Login().withValidCredentials()
        )
    }

    @Then("a booking should be created")
    fun a_booking_should_be_created(){
        OnStage.theActorInTheSpotlight().asksFor(CarIsBooked())
    }
}
