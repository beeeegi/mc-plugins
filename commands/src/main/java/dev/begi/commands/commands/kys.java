package dev.begi.commands.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getLogger;

public class kys implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player p){
            p.setHealth(0);
            p.sendMessage(ChatColor.RED + "you used the command /kys and died :0");

        }else{
            getLogger().info("the player should run it.");
        }


        return true;
    }
}
