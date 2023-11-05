package net.ccbluex.liquidbounce.features.module.modules.rong
/*
 * FDPClient Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by LiquidBounce.
 * https://github.com/SkidderMC/FDPClient/
 */
import net.ccbluex.liquidbounce.event.EventTarget
import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.utils.ClientUtils
import java.time.LocalTime
import kotlin.concurrent.thread

class ClientTime : Module("ClientTime","视觉的一种", category = ModuleCategory.RONG) {

    val timeone = LocalTime.now().second
    val timetwo = LocalTime.now().minute
    val timethree = LocalTime.now().hour
    val ClienTitle = ClientUtils
    var timeall1 = timethree + timetwo + timeone
    var timeall = timethree + timetwo + timeone
    var i = 1
    @EventTarget
    fun runtime() {
        while (i <= 10){
            i = i + 1
            timeall = timethree + timetwo + timeone
            timeall = timeall - timeall1
            ClienTitle.setTitle(timeall)
        }
    }

    private var prevGamma = -1f
    override fun onEnable() {

        runtime()
    }
    override fun onDisable() {
        ClienTitle.setTitle()
    }
}