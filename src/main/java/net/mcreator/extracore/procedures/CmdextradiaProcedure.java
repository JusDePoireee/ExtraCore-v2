package net.mcreator.extracore.procedures;

import org.bukkit.entity.Entity;

import java.util.Map;

public class CmdextradiaProcedure implements org.bukkit.event.Listener {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Cmdextradia!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.sendMessage("Extradia v2 - Created by Extradia Studios");
	}

}
