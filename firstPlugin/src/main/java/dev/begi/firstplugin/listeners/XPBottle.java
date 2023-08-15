package dev.begi.firstplugin.listeners;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;

public class XPBottle implements Listener {

    @EventHandler
    public void Break(ExpBottleEvent e){
        e.setShowEffect(false);
    }

}
