package xyz.cazcez.PreventItemBurning;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustEvent;

public class ItemListener implements Listener
{
    private final Main main;

    public ItemListener(Main main)
    {
        this.main = main;
    }

    @EventHandler
    public void entityCombus(EntityCombustEvent event)
    {
        Bukkit.broadcastMessage(event.getEntity().getName());
    }
}
