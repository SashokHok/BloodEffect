package me.sashok_hok.bloodeffect.command;

import lombok.NonNull;
import me.sashok_hok.bloodeffect.BloodEffect;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EffectCommand implements CommandExecutor {

    private final BloodEffect plugin;

    public EffectCommand(BloodEffect plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NonNull CommandSender sender, @NonNull Command cmd, @NonNull String lebal, String[] args) {
        if (!sender.hasPermission("bloodeffect.admin")) {
            sender.sendMessage(plugin.getSettings().getNoPermissionMsg());
            return true;
        }
        if (args.length == 0) {
            sender.sendMessage(plugin.getSettings().getPluginCommandHelp());
            return true;
        }

        if (args[0].equalsIgnoreCase("reload")) {
            plugin.ConfigReload();
            sender.sendMessage(plugin.getSettings().getPluginReloadConfig());
            return true;
        }
        return false;
    }
}
