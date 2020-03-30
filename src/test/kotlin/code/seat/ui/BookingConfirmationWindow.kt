package code.seat.ui

import io.appium.java_client.MobileBy
import net.serenitybdd.screenplay.targets.Target

object BookingConfirmationWindow {
    val BOOKING_CONFIRMATION_TEXT : Target = Target.the("Booking Confirmation text").located(
        MobileBy.id("seat.code.emobility.seatmo:id/done")
    )

    val CONTINUE_BUTTON : Target = Target.the("Continue Button").located(
        MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
    )
}
