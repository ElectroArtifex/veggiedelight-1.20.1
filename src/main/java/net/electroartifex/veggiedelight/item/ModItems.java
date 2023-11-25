package net.electroartifex.veggiedelight.item;

import net.electroartifex.veggiedelight.VeggieDelight;
import net.electroartifex.veggiedelight.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SOYBEAN = registerItem("soybean", new AliasedBlockItem(ModBlocks.SOYBEAN_CROP, new FabricItemSettings().food(ModFoodComponents.SOYBEAN)));
    public static final Item DRIED_SOYBEAN = registerItem("dried_soybean", new Item(new FabricItemSettings()));
    public static final Item GYPSUM = registerItem("gypsum", new Item(new FabricItemSettings()));
    public static final Item SOY_MILK = registerItem("soy_milk", new Item(new FabricItemSettings()));
    public static final Item TOFU = registerItem("tofu", new Item(new FabricItemSettings().food(ModFoodComponents.TOFU)));

    private static void addItemsToIngredientsTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SOYBEAN);
        entries.add(DRIED_SOYBEAN);
        entries.add(GYPSUM);
        entries.add(SOY_MILK);
        entries.add(TOFU);

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(VeggieDelight.MOD_ID, name), item);
    }
    public static void registerModItems() {
        VeggieDelight.LOGGER.info("Registering Mod Items for " + VeggieDelight.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTabItemGroup);
    }
}
