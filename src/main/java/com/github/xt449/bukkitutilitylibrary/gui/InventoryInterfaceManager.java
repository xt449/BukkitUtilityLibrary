package com.github.xt449.bukkitutilitylibrary.gui;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

/**
 * @author xt449
 */
public class InventoryInterfaceManager {

	private static boolean initialized = false;

	public static void initialize(@NotNull final Plugin plugin) {
		if(!initialized) {
			Bukkit.getPluginManager().registerEvents(new InventoryInterfaceListener(), plugin);
			initialized = true;
		}
	}
}