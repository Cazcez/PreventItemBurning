package xyz.cazcez.PreventItemLightning;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class ItemListener implements Listener
{
    private final Main main;

    public ItemListener(Main main)
    {
        this.main = main;
    }

    @EventHandler
    public void entityDamage(EntityDamageEvent event)
    {
        if (!(event.getEntityType() == EntityType.DROPPED_ITEM))
            return;

        if (!(event.getCause() == EntityDamageEvent.DamageCause.LIGHTNING))
            return;

        event.setCancelled(true);
    }
}
