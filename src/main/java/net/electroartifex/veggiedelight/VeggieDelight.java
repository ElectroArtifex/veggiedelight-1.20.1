package net.electroartifex.veggiedelight;

import net.electroartifex.veggiedelight.block.ModBlocks;
import net.electroartifex.veggiedelight.item.ModItemGroups;
import net.electroartifex.veggiedelight.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VeggieDelight implements ModInitializer {
	public static final String MOD_ID = "veggiedelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}