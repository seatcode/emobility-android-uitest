package code.seat.ui

import io.appium.java_client.MobileBy
import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By

object AllowLocationWindow {
    val ALLOW  : Target = Target.the("Allow while using the app").located(
        By.id("com.android.packageinstaller:id/permission_allow_button")
    )

    val DENY  : Target = Target.the("Allow Once").located(
        MobileBy.id("com.android.packageinstaller:id/permission_deny_button")
    )
}
