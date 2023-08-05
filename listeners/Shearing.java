package dev.begi.firstplugin.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class Shearing implements Listener {

    @EventHandler
    public void shear(PlayerShearEntityEvent e){
        Player player = e.getPlayer();
        Entity entity = e.getEntity();

        if(entity.getType() == EntityType.SHEEP){
            e.setCancelled(true);
            player.sendMessage("this is a sheep, so you can't shear it");
        }else{
            player.sendMessage("this is not a sheep, so you can shear it");
        }

    }

}
