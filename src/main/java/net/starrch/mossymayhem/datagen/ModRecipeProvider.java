package net.starrch.mossymayhem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.starrch.mossymayhem.MossyMayhem;
import net.starrch.mossymayhem.block.ModBlocks;
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

                //nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.MOSS_CLUMP, RecipeCategory.BUILDING_BLOCKS, Blocks.MOSS_BLOCK);

                shaped(RecipeCategory.MISC, Blocks.MOSS_BLOCK)
                        .pattern("RR")
                        .pattern("RR")
                        .define('R', ModItems.MOSS_CLUMP)
                        .unlockedBy(getHasName(ModItems.MOSS_CLUMP), has(ModItems.MOSS_CLUMP))
                        .group("moss_block")
                        .save(output, "moss_block_from_clumps");
                shapeless(RecipeCategory.MISC, ModItems.MOSS_CLUMP, 4)
                        .requires(Blocks.MOSS_BLOCK)
                        .unlockedBy(getHasName(Blocks.MOSS_BLOCK), has(Blocks.MOSS_BLOCK))
                        .group("moss_clump")
                        .save(output, "moss_from_block");



                shaped(RecipeCategory.MISC, ModBlocks.DRIED_MOSS_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.DRIED_MOSS_CLUMP)
                        .unlockedBy(getHasName(ModItems.DRIED_MOSS_CLUMP), has(ModItems.DRIED_MOSS_CLUMP))
                        .group("moss_block")
                        .save(output, "dried_moss_block_from_clumps");
                shapeless(RecipeCategory.MISC, ModItems.DRIED_MOSS_CLUMP, 9)
                        .requires(ModBlocks.DRIED_MOSS_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.DRIED_MOSS_BLOCK), has(ModBlocks.DRIED_MOSS_BLOCK))
                        .group("moss_clump")
                        .save(output, "dried_moss_from_block");


            }
        };
    }

    @Override
    public String getName() {
        return "Mossy Recipes";
    }
}
