package dev.begi.firstplugin;

import dev.begi.firstplugin.listeners.BedListeners;
import dev.begi.firstplugin.listeners.JoinAndLeave;
import dev.begi.firstplugin.listeners.Shearing;
import dev.begi.firstplugin.listeners.XPBottle;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getLogger().info("##############################");
        getLogger().info("plugin has been loaded successfully");
        getLogger().info("something smart here lol xd lol xd lol xd");
        getLogger().info("Version: 6.9");
        getLogger().info("##############################");

        getServer().getPluginManager().registerEvents(new BedListeners(), this);
        getServer().getPluginManager().registerEvents(new JoinAndLeave(), this);
        getServer().getPluginManager().registerEvents(new XPBottle(), this);
        getServer().getPluginManager().registerEvents(new Shearing(), this);

    }
}


