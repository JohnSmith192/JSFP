package com.jsfp;

import com.jsfp.commands.version;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class JSFP extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        // The sentences that should say at the Server beginning
        this.getLogger().info("Hello world!");
        this.getLogger().info("Wow! You did it. You are running my first Plugin on a Minecraft Server. That's great!");
        this.getLogger().info("Enjoy my plugin. Enjoy its perfect performance. Well, I hope you won't enjoy the BUGS");
        this.getLogger().info("Anyway, I don't know how you fell. But I am very excited. As its name. This is my first plugins");
        this.getLogger().info("It contains several simply function. Hope you will enjoy it");


        // register commands
        Bukkit.getPluginCommand("jsfp").setExecutor(new version());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Hope to see you again, bye!");
    }
}
