package me.sashok_hok.bloodeffect.utils;

import lombok.Getter;
import me.sashok_hok.bloodeffect.BloodEffect;
import org.bukkit.Bukkit;
import org.bukkit.Material;

import java.util.logging.Level;

@Getter
public class Settings {

    private final BloodEffect plugin;

    private String noPermissionMsg;

    private String pluginReloadConfig;

    private String pluginCommandHelp;

    private Boolean bloodEffectEnable;

    private Boolean playerBloodEffectEnable;

    private Boolean mobBloodEffectEnable;

    private Boolean ProjectileBloodEffectEnable;

    private Double playerBloodYOffset;

    private Double mobBloodYOffset;

    private Double projectileBloodYOffset;

    private Boolean crackShotEnable;

    private Boolean crackShotPlayerEnable;

    private Boolean crackShotMobEnable;

    private Double crackShotPlayerYOffset;

    private Double crackShotMobYOffset;

    private Boolean crackShotPlayerHeadshot;

    private Boolean crackShotMobHeadshot;

    private Double crackShotPlayerHeadShotYOffset;

    private Double crackShotMobHeadShotYOffset;

    private Material bloodMaterial;

    public Settings(BloodEffect plugin) {
        this.plugin = plugin;
    }


    public void loadConfig() {
        //Command
        noPermissionMsg = plugin.getUtils().charReplace(plugin.getConfig().getString("Command.noPermission"));
        pluginReloadConfig = plugin.getUtils().charReplace(plugin.getConfig().getString("Command.pluginConfigReloaded"));
        pluginCommandHelp = plugin.getUtils().charReplace(plugin.getConfig().getString("Command.Use"));

        //BloodEffect Settings
        bloodEffectEnable = plugin.getConfig().getBoolean("bloodEffect.enable", true);
        playerBloodYOffset = plugin.getConfig().getDouble("bloodEffect.player.yOffset", 1.0);
        mobBloodYOffset = plugin.getConfig().getDouble("bloodEffect.mob.yOffset", 0.5);
        projectileBloodYOffset = plugin.getConfig().getDouble("bloodEffect.projectile.yOffset", 1.5);
        playerBloodEffectEnable = plugin.getConfig().getBoolean("bloodEffect.player.enable", true);
        mobBloodEffectEnable = plugin.getConfig().getBoolean("bloodEffect.mob.enable", false);
        ProjectileBloodEffectEnable = plugin.getConfig().getBoolean("bloodEffect.projectile.enable", false);

        // CrackShot Settings
        crackShotEnable = plugin.getConfig().getBoolean("crackShotEffect.enable", false);
        crackShotPlayerEnable = plugin.getConfig().getBoolean("crackShotEffect.player.enable", true);
        crackShotPlayerYOffset = plugin.getConfig().getDouble("crackShotEffect.player.yOffset", 1.0);
        crackShotMobEnable = plugin.getConfig().getBoolean("crackShotEffect.mob.enable", false);
        crackShotMobYOffset = plugin.getConfig().getDouble("crackShotEffect.mob.yOffset", 0.5);

        // HeadShot Settings
        crackShotPlayerHeadshot = plugin.getConfig().getBoolean("crackShotEffect.HeadShot.player.enable", true);
        crackShotPlayerHeadShotYOffset = plugin.getConfig().getDouble("crackShotEffect.HeadShot.player.yOffset", 2.0);
        crackShotMobHeadshot = plugin.getConfig().getBoolean("crackShotEffect.HeadShot.mob.enable", true);
        crackShotMobHeadShotYOffset = plugin.getConfig().getDouble("crackShotEffect.HeadShot.mob.yOffset", 1.5);

        // BlockType
        String materialName = plugin.getConfig().getString("bloodEffect.blockType");
        bloodMaterial = Material.getMaterial(materialName);
        if (bloodMaterial == null) {
            Bukkit.getLogger().log(Level.WARNING, "Error: Material \"" + materialName + "\" doesn't seem to exist. Double-check your config!");
            Bukkit.getLogger().log(Level.WARNING, "Replacing with default: REDSTONE_BLOCK");
            bloodMaterial = Material.REDSTONE_BLOCK;
        }

    }
}
