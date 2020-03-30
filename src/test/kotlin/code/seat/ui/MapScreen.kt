package code.seat.ui

import io.appium.java_client.MobileBy
import net.serenitybdd.screenplay.targets.Target

object MapScreen{
    val GPS_BUTTON : Target = Target.the("Parking Poi").located(
        MobileBy.id("seat.code.emobility.seatmo:id/map_user_location_button")
    )

    val MAP_PIN : Target = Target.the("Parking POI").located(
        MobileBy.xpath("//android.view.View[@content-desc='Google Map']/android.view.View")
    )
}
