package code.seat.steps

import code.seat.tasks.AcceptLocation
import cucumber.api.java.en.Given
import net.serenitybdd.screenplay.abilities.BrowseTheWeb
import net.serenitybdd.screenplay.actors.OnStage
import net.thucydides.core.annotations.Managed
import org.openqa.selenium.WebDriver

class GeneralSteps {

    @Managed(driver = "Appium")
    val theMobileDevice: WebDriver? = null

    @Given("(.*) has location enabled")
    fun user_has_location_enabled(actorName : String){
        OnStage.theActorCalled(actorName).can(BrowseTheWeb.with(theMobileDevice))
        OnStage.theActorInTheSpotlight().attemptsTo(
            AcceptLocation()
        )
    }
}