package club.invec.core.commands.staff;

import club.invec.core.utils.CC;
import club.invec.core.utils.Messages;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BroadcastCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender.hasPermission("invec.commands.broadcastcommand"))) {
            sender.sendMessage(Messages.NO_PERMISSION);
            return false;
        }
        if (args.length < 1) {
            sender.sendMessage(CC.RED + "Correct Usage: /broadcast <message>");
            return false;
        }
        sender.getServer().broadcastMessage(CC.D_GRAY + "[" + CC.D_RED + "Alert" + CC.D_GRAY + "] " + CC.WHITE + args[0]);
        return true;
    }
}
