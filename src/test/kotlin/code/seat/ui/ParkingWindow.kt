package code.seat.ui

import io.appium.java_client.MobileBy
import net.serenitybdd.core.annotations.findby.By
import net.serenitybdd.screenplay.targets.Target

object ParkingWindow {

    fun CAR(CarName: String) : Target =  Target.the("the car").located(
        By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    )
}