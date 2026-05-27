package net.starrch.mossymayhem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.starrch.mossymayhem.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlocksTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlocksTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.DRIED_MOSS_BLOCK);

        valueLookupBuilder(BlockTags.MOSS_BLOCKS)
                .add(ModBlocks.DRIED_MOSS_BLOCK);

        valueLookupBuilder(BlockTags.MOSS_REPLACEABLE)
            .add(ModBlocks.DRIED_MOSS_BLOCK);
    }
}
