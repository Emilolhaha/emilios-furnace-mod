package net.emilolhaha.emiliosfurnacemod;

import net.emilolhaha.emiliosfurnacemod.block.ModBlocks;
import net.emilolhaha.emiliosfurnacemod.item.ModItemGroups;
import net.emilolhaha.emiliosfurnacemod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmiliosFurnaceMod implements ModInitializer {
	public static final String MOD_ID = "emiliosfurnacemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// 1
		ModItems.registerModItems();
		// 2
		ModItemGroups.registerItemGroups();
		// 3
		ModBlocks.registerModBlocks();

	}
}