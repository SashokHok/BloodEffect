package me.sashok_hok.bloodeffect.utils;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;

public class BloodUtils {

    public static void bloodEffect(World world, Location location, Effect effect, Material material) {
        world.playEffect(location, effect, material);
    }

}
