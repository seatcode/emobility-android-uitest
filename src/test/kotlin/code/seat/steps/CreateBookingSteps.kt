package code.seat.steps

import code.seat.questions.LoginScreenAppears
import code.seat.tasks.*
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import cucumber.api.java.Before
import net.serenitybdd.screenplay.actors.OnStage
import net.serenitybdd.screenplay.actors.OnlineCast


open class CreateBookingSteps {

    @Before
    fun setTheStage(){
        OnStage.setTheStage(OnlineCast())
    }

    @When("^he books a car named \"([^\"]*)\"$")
    fun user_books_a_car(carName: String){
        OnStage.theActorInTheSpotlight().attemptsTo(
            SelectAParking().theFirstFound(),
            SelectACar().withName(carName),
            BookACar()
        )
    }

    @Then("Login To Continue Screen appears")
    fun login_screen_appears(){
        OnStage.theActorInTheSpotlight().asksFor(
            LoginScreenAppears()
        )
    }
}
