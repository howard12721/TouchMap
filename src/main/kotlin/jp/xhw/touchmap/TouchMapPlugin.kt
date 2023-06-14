package jp.xhw.touchmap

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import java.util.logging.Level

class TouchMapPlugin : JavaPlugin() {

    override fun onEnable() {
        Bukkit.getLogger().log(Level.INFO, "Plugin Enabled!")
    }

    override fun onDisable() {}

}
