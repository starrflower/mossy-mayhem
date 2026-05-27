package net.starrch.mossymayhem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;
import net.starrch.mossymayhem.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> MOSS_SMELTABLES = List.of(ModItems.MOSS_CLUMP);

                oreSmelting(MOSS_SMELTABLES, RecipeCategory.FOOD, CookingBookCategory.FOOD, ModItems.DRIED_MOSS_CLUMP, 0.0F, 200, "moss");



            }
        };
    }

    @Override
    public String getName() {
        return "Mossy Recipes";
    }
}
