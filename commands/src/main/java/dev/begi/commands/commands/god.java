package dev.begi.commands.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getLogger;

public class god implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player p){
            if (p.isInvulnerable()){
                p.setInvulnerable(false);
                p.sendMessage(ChatColor.RED + "god mode disabled");
            }else{
                p.setInvulnerable(true);
                p.sendMessage(ChatColor.GREEN + "god mode enabled");
            }

        }else{
            getLogger().info("the player should run it.");
        }

        return true;
    }
}
