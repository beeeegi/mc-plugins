package dev.begi.commands;

import dev.begi.commands.commands.feed;
import dev.begi.commands.commands.god;
import dev.begi.commands.commands.heal;
import dev.begi.commands.commands.kys;
import org.bukkit.plugin.java.JavaPlugin;

public final class Commands extends JavaPlugin {

    @Override
    public void onEnable() {

        getLogger().info("##############################");
        getLogger().info("plugin has been loaded successfully");
        getLogger().info("Version: 1.0");
        getLogger().info("##############################");

        getCommand("god").setExecutor(new god());
        getCommand("feed").setExecutor(new feed());
        getCommand("heal").setExecutor(new heal());
        getCommand("kys").setExecutor(new kys());

    }
}
