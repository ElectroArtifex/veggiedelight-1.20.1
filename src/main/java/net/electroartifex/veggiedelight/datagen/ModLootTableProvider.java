package net.electroartifex.veggiedelight.datagen;


import net.electroartifex.veggiedelight.block.ModBlocks;
import net.electroartifex.veggiedelight.block.custom.SoybeanCropBlock;
import net.electroartifex.veggiedelight.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.GYPSUM_BLOCK);
        addDrop(ModBlocks.APPLE_CRATE);
        addDrop(ModBlocks.MELON_CRATE);
        addDrop(ModBlocks.PUMPKIN_CRATE);
        addDrop(ModBlocks.SOYBEAN_CRATE);

        addDrop(ModBlocks.WILD_SOYBEAN, ModItems.SOYBEAN);

        addDrop(ModBlocks.GYPSUM_ORE, copperLikeOreDrops(ModBlocks.GYPSUM_ORE, ModItems.GYPSUM));

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.SOYBEAN_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(SoybeanCropBlock.AGE, 7));
        addDrop(ModBlocks.SOYBEAN_CROP, cropDrops(ModBlocks.SOYBEAN_CROP, ModItems.SOYBEAN, ModItems.SOYBEAN, builder));

    }
    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(ModItems.GYPSUM)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
