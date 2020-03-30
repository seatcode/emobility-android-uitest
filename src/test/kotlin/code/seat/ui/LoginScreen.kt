package code.seat.ui

import io.appium.java_client.MobileBy
import net.serenitybdd.screenplay.targets.Target

object LoginScreen {
    val LOGIN_FORM_BUTTON: Target = Target.the("Login form submit button").located(
        MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[1]")
    )
    val LOGIN_FORM_PASSWORD: Target = Target.the("Login Password input text").located(
        MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    )

    val LOGIN_FORM_EMAIL : Target = Target.the("Login Email text input").located(
        MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
    )
}
