package dev.begi.firstplugin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinAndLeave implements Listener {

    @EventHandler
    public void Join(PlayerJoinEvent e){
        Player player = e.getPlayer();

        if (player.hasPlayedBefore()){
            e.setJoinMessage(ChatColor.GREEN + "welcome back, " + ChatColor.YELLOW + "" + ChatColor.BOLD + player.getDisplayName() + "!");
        }else{
            e.setJoinMessage(ChatColor.BLUE + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.BLUE + " has joined for the first time!");
        }
    }

    @EventHandler
    public void Leave(PlayerQuitEvent e){
        Player player = e.getPlayer();
        e.setQuitMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.RED + " has left...............");
    }

}
