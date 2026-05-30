package net.starrch.mossymayhem.registries;

import net.fabricmc.fabric.api.registry.FuelValueEvents;
import net.starrch.mossymayhem.block.ModBlocks;
import net.starrch.mossymayhem.item.ModItems;

public class ModFuels {
    public static void registerFuels() {
        FuelValueEvents.BUILD.register((builder, context) ->  {
            builder.add(ModBlocks.DRIED_MOSS_BLOCK, 1800);
            builder.add(ModItems.DRIED_MOSS_CLUMP, 200);
        });
    }
}
