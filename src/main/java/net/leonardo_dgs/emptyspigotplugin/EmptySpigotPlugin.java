package net.leonardo_dgs.emptyspigotplugin;

import lombok.Getter;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class EmptySpigotPlugin extends JavaPlugin implements Listener {

    @Getter
    private static EmptySpigotPlugin instance;

    @Override
    public void onEnable()
    {
        instance = this;
    }

    @Override
    public void onDisable()
    {

    }

}
