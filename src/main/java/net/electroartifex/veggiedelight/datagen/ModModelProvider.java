package net.electroartifex.veggiedelight.datagen;

import net.electroartifex.veggiedelight.block.ModBlocks;
import net.electroartifex.veggiedelight.block.custom.SoybeanCropBlock;
import net.electroartifex.veggiedelight.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GYPSUM_BLOCK);
        blockStateModelGenerator.registerCrop(ModBlocks.SOYBEAN_CROP, SoybeanCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.GYPSUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOY_MILK, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRIED_SOYBEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOFU, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEFF, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEFF_RECIPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHICKN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEEZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHICKN_RECIPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEEZ_RECIPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FAKON, Models.GENERATED);
        itemModelGenerator.register(ModItems.FAKON_RECIPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEM_RECIPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUTTN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUTTN_RECIPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEGG, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEGG_RECIPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RABBNT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RABBNT_RECIPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SORTA_FISHY, Models.GENERATED);
        itemModelGenerator.register(ModItems.SORTA_FISHY_RECIPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EDAMAME, Models.GENERATED);
        itemModelGenerator.register(ModItems.UDON, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILKEN_STEW, Models.GENERATED);
        itemModelGenerator.register(ModItems.MISO_BROTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MISO_SOUP, Models.GENERATED);
    }
}
