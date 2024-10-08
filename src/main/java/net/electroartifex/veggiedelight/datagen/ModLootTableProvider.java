package net.electroartifex.veggiedelight.datagen;


import net.electroartifex.veggiedelight.block.ModBlocks;
import net.electroartifex.veggiedelight.block.custom.SoybeanCropBlock;
import net.electroartifex.veggiedelight.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.GYPSUM_BLOCK);
        addDrop(ModBlocks.SOYBEAN_CRATE);

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.SOYBEAN_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(SoybeanCropBlock.AGE, 7));
        addDrop(ModBlocks.SOYBEAN_CROP, cropDrops(ModBlocks.SOYBEAN_CROP, ModItems.SOYBEAN, ModItems.SOYBEAN, builder));

    }
}
