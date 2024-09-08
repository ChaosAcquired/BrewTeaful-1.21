package net.chaosacquired.brewteaful;

import net.chaosacquired.brewteaful.block.ModBlocks;
import net.chaosacquired.brewteaful.item.ModItemGroups;
import net.chaosacquired.brewteaful.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrewTeaful implements ModInitializer {
	public static final String MOD_ID = "brewteaful";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}