package dev.begi.commands.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getLogger;

public class feed implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player p){
            p.setFoodLevel(20);
            p.sendMessage(ChatColor.YELLOW + "you fed yourself");

        }else{
            getLogger().info("the player should run it.");
        }

        return true;

    }
}
