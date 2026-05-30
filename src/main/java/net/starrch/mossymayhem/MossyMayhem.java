package net.starrch.mossymayhem;

import net.fabricmc.api.ModInitializer;

import net.starrch.mossymayhem.block.ModBlocks;
import net.starrch.mossymayhem.creativemovetab.ModCreativeModeTabs;
import net.starrch.mossymayhem.item.ModItems;
import net.starrch.mossymayhem.registries.ModFuels;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MossyMayhem implements ModInitializer {
	public static final String MOD_ID = "mossy-mayhem";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MossyMayhem.LOGGER.info("Initializing " + MossyMayhem.MOD_ID);

		ModCreativeModeTabs.registerModCreativeModeTabs();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModFuels.registerFuels();

	}
}