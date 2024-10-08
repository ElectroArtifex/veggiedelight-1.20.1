package net.electroartifex.veggiedelight.block;

import net.electroartifex.veggiedelight.VeggieDelight;
import net.electroartifex.veggiedelight.block.custom.SoybeanCropBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block GYPSUM_BLOCK = registerBlock("gypsum_block",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));


    public static final Block SOYBEAN_CRATE = registerBlock("soybean_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.CARVED_PUMPKIN)));


    public static final Block SOYBEAN_CROP = Registry.register(Registries.BLOCK, new Identifier(VeggieDelight.MOD_ID, "soybean_crop"),
            new SoybeanCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(VeggieDelight.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(VeggieDelight.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        VeggieDelight.LOGGER.info("Registering ModBlocks for " + VeggieDelight.MOD_ID);
    }
}
