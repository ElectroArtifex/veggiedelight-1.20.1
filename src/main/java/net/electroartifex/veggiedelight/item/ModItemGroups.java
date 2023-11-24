package net.electroartifex.veggiedelight.item;

import net.electroartifex.veggiedelight.VeggieDelight;
import net.electroartifex.veggiedelight.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SOYBEAN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VeggieDelight.MOD_ID, "soybean"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.soybean"))
                .icon(() -> new ItemStack(ModItems.SOYBEAN)).entries((displayContext, entries) -> {
                    entries.add(ModItems.SOYBEAN);
                    entries.add(ModItems.DRIED_SOYBEAN);
                    entries.add(ModItems.GYPSUM);
                    entries.add(ModItems.SOY_MILK);
                    entries.add(ModItems.TOFU);

                    entries.add(ModBlocks.GYPSUM_BLOCK);
                    entries.add(ModBlocks.GYPSUM_ORE);

            }).build());
    public static void registerItemGroups() {
        VeggieDelight.LOGGER.info("Registering Item Groups for " +VeggieDelight.MOD_ID);
    }
}
