package dev.begi.firstplugin.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class BedListeners implements Listener {

    @EventHandler
    public void Leave(PlayerBedLeaveEvent event){
        Player player = event.getPlayer();

        player.setHealth(20);
        player.sendMessage("you just left your bed, so you are full HP now");

    }

    @EventHandler
    public void Enter(PlayerBedEnterEvent event){
        Player player = event.getPlayer();

        player.setHealth(0.5);
        player.sendMessage("you just entered your bed, so you are half HP now, be careful");

    }

}
