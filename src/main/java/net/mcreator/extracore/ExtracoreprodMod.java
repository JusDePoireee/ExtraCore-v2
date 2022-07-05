/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and the proxy files
 *    and they won't get overwritten. If you change your mod package or modid, you
 *    need to apply these changes to this file MANUALLY.
 *
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.extracore;

import org.bukkit.plugin.java.JavaPlugin;

import net.mcreator.extracore.procedures.CmdextradiaProcedure;
import net.mcreator.extracore.commands.Extradia;

public class ExtracoreprodMod extends JavaPlugin {
	@Override
	public void onEnable() {
		// Commands
		this.getCommand("extradia").setExecutor(new Extradia());
		// Procedures
		getServer().getPluginManager().registerEvents(new CmdextradiaProcedure(), this);
	}

	@Override
	public void onDisable() {
	}
}
