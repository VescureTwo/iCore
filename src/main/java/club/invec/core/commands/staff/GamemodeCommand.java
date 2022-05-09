package club.invec.core.commands.staff;

import club.invec.core.utils.CC;
import club.invec.core.utils.Messages;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender.hasPermission("invec.commands.gamemodecommand"))) {
            sender.sendMessage(Messages.NO_PERMISSION);
            return false;
        }
        if (args.length < 1) {
            sender.sendMessage(CC.RED + "Correct Usage: /gamemode <mode>|<id>");
            return false;
        }
        Player target = (Player) sender;
        switch (args[0]) {
            case "0":
            case "survival":
            case "s":
                target.setGameMode(GameMode.SURVIVAL);
                sender.sendMessage(CC.RED + "Set Gamemode to Survival.");
                break;
            case "1":
            case "creative":
            case "c":
                target.setGameMode(GameMode.CREATIVE);
                sender.sendMessage(CC.RED + "Set Gamemode to Creative.");
                break;
            case "2":
            case "adventure":
            case "a":
                target.setGameMode(GameMode.ADVENTURE);
                sender.sendMessage(CC.RED + "Set Gamemode to Adventure.");
                break;
            case "3":
            case "spectator":
            case "sp":
                target.setGameMode(GameMode.SPECTATOR);
                sender.sendMessage(CC.RED + "Set Gamemode to Spectator.");
                break;
            default:
                sender.sendMessage(CC.RED + "Invalid Gamemode.");
                break;
        }
        return true;
    }
}
