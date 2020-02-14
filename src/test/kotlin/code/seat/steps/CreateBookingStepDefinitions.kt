package code.seat.steps

import code.seat.questions.CarIsBooked
import code.seat.tasks.BookACar
import code.seat.tasks.SelectACar
import code.seat.tasks.SelectAParking
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import cucumber.api.java.Before
import net.serenitybdd.screenplay.actors.OnStage
import net.serenitybdd.screenplay.actors.OnlineCast


class CreateBookingStepDefinitions {

    @Before
    fun setTheStage(){
        OnStage.setTheStage(OnlineCast())
    }

    @When("s?he books a car named \"([^\"]*)\"\$")
    fun user_books_a_car(carName: String){
        OnStage.theActorInTheSpotlight().attemptsTo(
            SelectAParking().theFirstFound(),
            SelectACar().withName(carName),
            BookACar()
        )
    }

    @Then("a booking should be created")
    fun a_booking_should_be_created(){
        OnStage.theActorInTheSpotlight().asksFor(CarIsBooked())
    }
}