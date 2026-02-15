package me.sashok_hok.bloodeffect.utils;

import me.sashok_hok.bloodeffect.BloodEffect;
import org.bukkit.Bukkit;

import java.io.File;
import java.util.logging.Level;


public class Utils {

    private final BloodEffect plugin;


    public Utils(BloodEffect plugin) {
        this.plugin = plugin;
    }


    public void saveDefaultConfig() {
        File file = new File(plugin.getDataFolder(), "config.yml");
        if (!file.exists()) {
            plugin.saveDefaultConfig();
            plugin.reloadConfig();
        } else {
            plugin.reloadConfig();
        }
    }


    public String charReplace(String string) {
        return string == null ? null : string.replace("&", "§");
    }


    public Boolean pluginCheck(String pluginName, String info, String warn) {
        if (Bukkit.getServer().getPluginManager().getPlugin(pluginName) != null) {
            if (info != null) {
                Bukkit.getLogger().log(Level.INFO, BloodEffect.P + info.replace("%plugin", pluginName));
            }
            return true;
        } else {
            if (warn != null) {
                Bukkit.getLogger().log(Level.WARNING, BloodEffect.P + warn.replace("%plugin", pluginName));
            }
            return false;
        }
    }

}
