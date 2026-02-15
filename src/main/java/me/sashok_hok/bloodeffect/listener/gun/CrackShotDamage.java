package me.sashok_hok.bloodeffect.listener.gun;

import com.shampaggon.crackshot.events.WeaponDamageEntityEvent;
import me.sashok_hok.bloodeffect.BloodEffect;
import me.sashok_hok.bloodeffect.utils.BloodUtils;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class CrackShotDamage implements Listener {

    private final BloodEffect plugin;

    public CrackShotDamage(BloodEffect plugin) {
        this.plugin = plugin;
    }


    @EventHandler(priority = EventPriority.MONITOR)
    public void onWeaponsDamage(WeaponDamageEntityEvent event) {
        Entity victim = event.getVictim();
        World world = victim.getWorld();
        if (!plugin.getSettings().getBloodEffectEnable()) return;
        if (!plugin.getSettings().getCrackShotEnable()) return;
        if (victim.getType() == EntityType.PLAYER) {
            Player player = event.getPlayer();
            if (!plugin.getSettings().getCrackShotPlayerEnable()) return;
            if (player.getGameMode() == GameMode.CREATIVE) return;
            double yOffset = plugin.getSettings().getCrackShotPlayerYOffset();
            Location loc = victim.getLocation().add(0.0, yOffset, 0.0);
            BloodUtils.bloodEffect(world, loc, Effect.STEP_SOUND, plugin.getSettings().getBloodMaterial());
            if (event.isHeadshot()) {
                if (!plugin.getSettings().getCrackShotPlayerHeadshot()) return;
                double HeadShotPlayerYOffset = plugin.getSettings().getCrackShotPlayerHeadShotYOffset();
                Location HeadShotPlayerlocation = victim.getLocation().add(0.0, HeadShotPlayerYOffset, 0.0);
                BloodUtils.bloodEffect(world, HeadShotPlayerlocation, Effect.STEP_SOUND, plugin.getSettings().getBloodMaterial());
            }
        } else {
            if (!plugin.getSettings().getCrackShotMobEnable()) return;
            double yOffset = plugin.getSettings().getCrackShotMobYOffset();
            Location loc = victim.getLocation().add(0.0, yOffset, 0.0);
            BloodUtils.bloodEffect(world, loc, Effect.STEP_SOUND, plugin.getSettings().getBloodMaterial());
            if (event.isHeadshot()) {
                if (!plugin.getSettings().getCrackShotMobHeadshot()) return;
                double HeadShotMobyOffset = plugin.getSettings().getCrackShotMobHeadShotYOffset();
                Location HeadShotMoblocation = victim.getLocation().add(0.0, HeadShotMobyOffset, 0.0);
                BloodUtils.bloodEffect(world, HeadShotMoblocation, Effect.STEP_SOUND, plugin.getSettings().getBloodMaterial());
            }
        }
    }

}
