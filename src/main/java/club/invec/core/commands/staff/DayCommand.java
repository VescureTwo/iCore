package club.invec.core.commands.staff;

import club.invec.core.utils.CC;
import club.invec.core.utils.Messages;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DayCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender.hasPermission("invec.commands.daycommand"))) {
            sender.sendMessage(Messages.NO_PERMISSION);
            return false;
        }
        for (World world : Bukkit.getServer().getWorlds()) {
            world.setTime(0);
        }
        sender.sendMessage(CC.RED + "Set time to day.");
        return true;
    }
}
