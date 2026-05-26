package net.starrch.mossymayhem.creativemovetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.starrch.mossymayhem.MossyMayhem;
import net.starrch.mossymayhem.item.ModItems;

public class ModCreativeModeTabs {
    public static final CreativeModeTab MOSS_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(MossyMayhem.MOD_ID, "moss_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOSS_CLUMP))
                    .title(Component.translatable("creativemodtab.mossymayhem.moss_items"))
                    .displayItems((parameters, output) -> {

                        // items in tab
                        output.accept(ModItems.MOSS_CLUMP);

                    }).build());

    public static final CreativeModeTab MOSS_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(MossyMayhem.MOD_ID, "moss_items_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOSS_CLUMP))
                    .title(Component.translatable("creativemodtab.mossymayhem.moss_blocks"))
                    .displayItems((parameters, output) -> {

                        // items in tab
                        output.accept(ModItems.MOSS_CLUMP);

                    }).build());

    public static void registerModCreativeModeTabs() {
        MossyMayhem.LOGGER.info("Registering Creative Mode Tabs for " + MossyMayhem.MOD_ID);
    }
}
