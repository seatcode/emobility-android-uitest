package code.seat.steps

import code.seat.tasks.AcceptLocation
import cucumber.api.java.en.Given
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import net.serenitybdd.screenplay.abilities.BrowseTheWeb
import net.serenitybdd.screenplay.actors.OnStage
import net.thucydides.core.annotations.Managed
import org.openqa.selenium.WebDriver

open class GeneralSteps {

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
