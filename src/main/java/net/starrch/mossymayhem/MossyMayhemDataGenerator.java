package net.starrch.mossymayhem;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.starrch.mossymayhem.datagen.ModBlockLootTableProvider;
import net.starrch.mossymayhem.datagen.ModBlocksTagsProvider;
import net.starrch.mossymayhem.datagen.ModModelProvider;
import net.starrch.mossymayhem.datagen.ModRecipeProvider;

public class MossyMayhemDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlocksTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
