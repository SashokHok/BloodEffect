package me.sashok_hok.bloodeffect;

import lombok.Getter;
import me.sashok_hok.bloodeffect.command.EffectCommand;
import me.sashok_hok.bloodeffect.listener.EntityDamage;
import me.sashok_hok.bloodeffect.listener.gun.CrackShotDamage;
import me.sashok_hok.bloodeffect.utils.Settings;
import me.sashok_hok.bloodeffect.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class BloodEffect extends JavaPlugin {

    Logger logger = Bukkit.getLogger();

    public static String P = "[BloodEffect] ";

    @Getter
    private Utils utils;

    @Getter
    private Settings settings;

    @Override
    public void onEnable() {
        logger.log(Level.INFO, P + "Enable");
        utils = new Utils(this);
        utils.saveDefaultConfig();
        settings = new Settings(this);
        settings.loadConfig();
        getCommand("bloodeffect").setExecutor(new EffectCommand(this));
        Bukkit.getPluginManager().registerEvents(new EntityDamage(this),this);
        if (utils.pluginCheck("CrackShot", "", "Plugin %plugin not found!")) {
            Bukkit.getPluginManager().registerEvents(new CrackShotDamage(this), this);
        }

    }



    public void ConfigReload() {
        utils.saveDefaultConfig();
        settings.loadConfig();
        logger.log(Level.INFO, P + "Config.yml Reloaded");
    }

    @Override
    public void onDisable() {
       logger.log(Level.INFO, P + "Disable");
    }
}
