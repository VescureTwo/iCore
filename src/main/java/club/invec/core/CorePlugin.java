package club.invec.core;

import club.invec.core.commands.DiscordCommand;
import club.invec.core.commands.staff.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class CorePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&ciCore&8] &cLoading Commands..."));
        getCommand("ban").setExecutor(new BanCommand());
        getCommand("broadcast").setExecutor(new BroadcastCommand());
        getCommand("discord").setExecutor(new DiscordCommand());
        getCommand("day").setExecutor(new DayCommand());
        getCommand("gamemode").setExecutor(new GamemodeCommand());
        getCommand("night").setExecutor(new NightCommand());
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&ciCore&8] &cLoaded iCore!"));
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&ciCore&8] &cDisabled iCore!"));
    }
}
