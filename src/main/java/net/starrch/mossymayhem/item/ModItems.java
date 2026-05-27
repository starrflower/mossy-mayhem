package net.starrch.mossymayhem.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.starrch.mossymayhem.MossyMayhem;
import net.starrch.mossymayhem.food.ModFoods;

import java.util.function.Function;

public class ModItems {
    public static final Item MOSS_CLUMP = registerItem("moss_clump", properties -> new Item(properties.
            food(ModFoods.MOSS, ModFoods.MOSS_CONSUMABLE)));
    public static final Item DRIED_MOSS_CLUMP = registerItem("dried_moss_clump", Item::new);





    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MossyMayhem.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MossyMayhem.MOD_ID, name)))));
    }



    public static void registerModItems() {
        MossyMayhem.LOGGER.info("Registering Mod Items for " + MossyMayhem.MOD_ID);


    }
}
