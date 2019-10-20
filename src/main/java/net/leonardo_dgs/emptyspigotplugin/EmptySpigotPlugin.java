package net.leonardo_dgs.emptyspigotplugin;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class EmptySpigotPlugin extends JavaPlugin {

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
