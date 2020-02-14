package code.seat.steps

import code.seat.tasks.Login
import cucumber.api.java.en.And
import net.serenitybdd.screenplay.actors.OnStage

class AuthenticationSteps{
    @And("s?he login with valid credentials")
    fun user_login(){

        OnStage.theActorInTheSpotlight().attemptsTo(
            Login().withValidCredentials()
        )
    }
}