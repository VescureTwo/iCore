package club.invec.core.commands.staff;

import club.invec.core.utils.CC;
import club.invec.core.utils.Messages;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.security.MessageDigest;

public class BanCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target = Bukkit.getServer().getPlayer(args[0]);
        if (!sender.hasPermission("arane.commands.bancommand")) {
            sender.sendMessage(Messages.NO_PERMISSION);
            return false;
        }
        if (args.length < 1) {
            sender.sendMessage(CC.RED + "Correct Usage: /ban <player> <reason>");
            return false;
        }
        if (target == null) {
            sender.sendMessage(Messages.PLAYER_NOT_FOUND);
            return false;
        }
        sender.getServer().broadcastMessage(CC.PINK + target.getDisplayName() + CC.YELLOW + " was banned by " + CC.PINK + "AntiGamingChair " + CC.YELLOW + "for " + CC.PINK + "Unfair Advantage" + CC.YELLOW + ".");
        if (args.length > 1) {
            target.kickPlayer(args[1]);
            return false;
        }
        target.kickPlayer("Unfair Advantage");
         return true;
    }
}
