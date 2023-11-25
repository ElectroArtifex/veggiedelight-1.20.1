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
                    entries.add(ModItems.BEFF);
                    entries.add(ModItems.BEFF_RECIPE);
                    entries.add(ModItems.CHEEZ);
                    entries.add(ModItems.CHEEZ_RECIPE);
                    entries.add(ModItems.CHICKN);
                    entries.add(ModItems.CHICKN_RECIPE);
                    entries.add(ModItems.FAKON);
                    entries.add(ModItems.FAKON_RECIPE);
                    entries.add(ModItems.HEM);
                    entries.add(ModItems.HEM_RECIPE);
                    entries.add(ModItems.MUTTN);
                    entries.add(ModItems.MUTTN_RECIPE);
                    entries.add(ModItems.NEGG);
                    entries.add(ModItems.NEGG_RECIPE);
                    entries.add(ModItems.RABBNT);
                    entries.add(ModItems.RABBNT_RECIPE);
                    entries.add(ModItems.SORTA_FISHY);
                    entries.add(ModItems.SORTA_FISHY_RECIPE);

                    entries.add(ModBlocks.GYPSUM_BLOCK);
                    entries.add(ModBlocks.GYPSUM_ORE);

                    entries.add(ModBlocks.APPLE_CRATE);
                    entries.add(ModBlocks.MELON_CRATE);
                    entries.add(ModBlocks.PUMPKIN_CRATE);
                    entries.add(ModBlocks.SOYBEAN_CRATE);

            }).build());
    public static void registerItemGroups() {
        VeggieDelight.LOGGER.info("Registering Item Groups for " +VeggieDelight.MOD_ID);
    }
}
