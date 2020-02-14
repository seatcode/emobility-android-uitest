package code.seat.acceptancetests

import cucumber.api.CucumberOptions
import io.appium.java_client.service.local.AppiumDriverLocalService
import net.serenitybdd.cucumber.CucumberWithSerenity
import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.runner.RunWith

@RunWith(CucumberWithSerenity::class)
@CucumberOptions(features=["src/test/resources/features/"], glue =["code.seat"], tags = ["not @ignore"])
class AcceptanceTestsuite{

    companion object{

    @JvmStatic
    private val appiumService = AppiumDriverLocalService.buildDefaultService()

    @JvmStatic
    @BeforeClass
    fun startAppiumServer(){
        appiumService.start()
    }

    @JvmStatic
    @AfterClass
    fun stopAppiumServer(){
        appiumService.stop()
    }}
}
