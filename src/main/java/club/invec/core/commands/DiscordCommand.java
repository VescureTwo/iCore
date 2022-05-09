package club.invec.core.commands;

import club.invec.core.utils.CC;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DiscordCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(CC.RED + "Discord: " + CC.WHITE + "https://discord.gg/5fNvRQ7JDy");
        return true;
    }
}
