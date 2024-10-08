package net.electroartifex.veggiedelight.datagen;

import net.electroartifex.veggiedelight.block.ModBlocks;
import net.electroartifex.veggiedelight.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {


    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GYPSUM, RecipeCategory.DECORATIONS, ModBlocks.GYPSUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, ModItems.SOYBEAN, RecipeCategory.DECORATIONS, ModBlocks.SOYBEAN_CRATE);


    }
}
