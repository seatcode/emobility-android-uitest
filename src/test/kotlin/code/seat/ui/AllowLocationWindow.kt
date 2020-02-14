package code.seat.ui

import io.appium.java_client.MobileBy
import net.serenitybdd.screenplay.targets.Target

object AllowLocationWindow {
    val ALLOW_WHILE_USING_THE_APP  : Target = Target.the("Allow while using the app").located(
        MobileBy.AccessibilityId("Allow While Using App")
    )

    val ALLOW_ONCE  : Target = Target.the("Allow Once").located(
        MobileBy.AccessibilityId("Allow Once")
    )
    val DONT_ALLOW  : Target = Target.the("Don't allow").located(
        MobileBy.AccessibilityId("Don't Allow")
    )
}