package me.sashok_hok.bloodeffect.listener;

import me.sashok_hok.bloodeffect.BloodEffect;
import me.sashok_hok.bloodeffect.utils.BloodUtils;
import org.bukkit.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.ProjectileHitEvent;


public class EntityDamage implements Listener {

    private final BloodEffect plugin;

    public EntityDamage(BloodEffect plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onProjectileHit(ProjectileHitEvent event) {
        if (!plugin.getSettings().getBloodEffectEnable()) return;
        if (!plugin.getSettings().getProjectileBloodEffectEnable()) return;

        Projectile projectile = event.getEntity();
        World world = projectile.getWorld();

        Entity hitEntity = event.getHitEntity();
        if (hitEntity != null) {
            double yOffset = plugin.getSettings().getProjectileBloodYOffset();
            Location loc = hitEntity.getLocation().add(0.0, yOffset, 0.0);
            BloodUtils.bloodEffect(world, loc, Effect.STEP_SOUND, plugin.getSettings().getBloodMaterial());
        }
    }


    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        Entity entity = event.getEntity();
        World world = entity.getWorld();
        if (plugin.getSettings().getBloodEffectEnable()) {
            if (entity.getType() == EntityType.PLAYER) {
                Player player = (Player) entity;
                if (!plugin.getSettings().getPlayerBloodEffectEnable()) return;
                    if (player.getGameMode() == GameMode.CREATIVE) return;
                    double yOffset = plugin.getSettings().getPlayerBloodYOffset();
                    Location loc = entity.getLocation().add(0.0, yOffset, 0.0);
                    BloodUtils.bloodEffect(world, loc, Effect.STEP_SOUND, plugin.getSettings().getBloodMaterial());
            } else {
                if (!plugin.getSettings().getMobBloodEffectEnable()) return;
                double yOffset = plugin.getSettings().getMobBloodYOffset();
                Location loc = entity.getLocation().add(0.0, yOffset, 0.0);
                BloodUtils.bloodEffect(world, loc, Effect.STEP_SOUND, plugin.getSettings().getBloodMaterial());

            }
        }
    }


    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onEntityDamege(EntityDamageEvent event) {
        Entity entity = event.getEntity();
        World world = entity.getWorld();
        if (plugin.getSettings().getBloodEffectEnable()) {
            if (entity.getType() == EntityType.PLAYER) {
                Player player = (Player) entity;
                if (!plugin.getSettings().getPlayerBloodEffectEnable()) return;
                if (player.getGameMode() == GameMode.CREATIVE) return;
                final double yOffset = plugin.getSettings().getPlayerBloodYOffset();
                Location loc = player.getLocation().add(0.0, yOffset, 0.0);
                BloodUtils.bloodEffect(world, loc, Effect.STEP_SOUND, plugin.getSettings().getBloodMaterial());
            } else {
                if (!plugin.getSettings().getMobBloodEffectEnable()) return;
                final double yOffset = plugin.getSettings().getMobBloodYOffset();
                Location loc = entity.getLocation().add(0.0, yOffset, 0.0);
                BloodUtils.bloodEffect(world, loc, Effect.STEP_SOUND, plugin.getSettings().getBloodMaterial());
            }
        }

    }

}
