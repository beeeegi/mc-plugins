package dev.begi.commands.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getLogger;

public class heal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player p){
            p.setHealth(20);
            p.sendMessage(ChatColor.GREEN + "you healed yourself");

        }else{
            getLogger().info("the player should run it.");
        }


        return true;
    }
}
