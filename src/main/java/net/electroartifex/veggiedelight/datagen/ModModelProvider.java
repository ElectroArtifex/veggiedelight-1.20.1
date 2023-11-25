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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GYPSUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.APPLE_CRATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MELON_CRATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PUMPKIN_CRATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOYBEAN_CRATE);

        blockStateModelGenerator.registerCrop(ModBlocks.SOYBEAN_CROP, SoybeanCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.GYPSUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOY_MILK, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRIED_SOYBEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOFU, Models.GENERATED);
    }
}
