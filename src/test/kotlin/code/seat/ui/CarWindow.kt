package code.seat.ui

import io.appium.java_client.MobileBy
import net.serenitybdd.screenplay.targets.Target

object CarWindow{
    val BOOK_NOW : Target = Target.the("Book a car button").located(
        MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
    )
}
