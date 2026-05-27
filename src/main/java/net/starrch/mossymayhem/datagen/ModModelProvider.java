package net.starrch.mossymayhem.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.starrch.mossymayhem.block.ModBlocks;
import net.starrch.mossymayhem.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.DRIED_MOSS_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.MOSS_CLUMP, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.DRIED_MOSS_CLUMP, ModelTemplates.FLAT_ITEM);
    }
}
