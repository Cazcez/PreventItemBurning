package xyz.cazcez.PreventItemBurning;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


    @Override
    public void onEnable()
    {
        getLogger().info(ChatColor.DARK_PURPLE + " PreventItemBurning is loading");
        Bukkit.getPluginManager().registerEvents(new ItemListener(this), this);
        getLogger().info(ChatColor.DARK_PURPLE + " PreventItemBurning is loaded");
    }

    public void onDisable()
    {
        getLogger().info(ChatColor.DARK_PURPLE + " PreventItemBurning is disabled");
    }
}
