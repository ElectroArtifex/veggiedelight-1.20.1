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
    public static final Item SOY_MILK = registerItem("soy_milk", new Item(new FabricItemSettings().food(ModFoodComponents.SOY_MILK)));
    public static final Item TOFU = registerItem("tofu", new Item(new FabricItemSettings().food(ModFoodComponents.TOFU)));
    public static final Item FAKON = registerItem("fakon", new Item(new FabricItemSettings().food(ModFoodComponents.FAKON)));
    public static final Item BEFF = registerItem("beff", new Item(new FabricItemSettings().food(ModFoodComponents.BEFF)));
    public static final Item MUTTN = registerItem("muttn", new Item(new FabricItemSettings().food(ModFoodComponents.MUTTN)));
    public static final Item CHICKN = registerItem("chickn", new Item(new FabricItemSettings().food(ModFoodComponents.CHICKN)));
    public static final Item HEM = registerItem("hem", new Item(new FabricItemSettings().food(ModFoodComponents.HEM)));
    public static final Item RABBNT = registerItem("rabbnt", new Item(new FabricItemSettings().food(ModFoodComponents.RABBNT)));
    public static final Item SORTA_FISHY = registerItem("sorta_fishy", new Item(new FabricItemSettings().food(ModFoodComponents.SORTA_FISHY)));
    public static final Item CHEEZ = registerItem("cheez", new Item(new FabricItemSettings().food(ModFoodComponents.CHEEZ)));
    public static final Item NEGG = registerItem("negg", new Item(new FabricItemSettings().food(ModFoodComponents.NEGG)));
    public static final Item EDAMAME = registerItem("edamame", new Item(new FabricItemSettings().food(ModFoodComponents.EDAMAME)));
    public static final Item MISO_BROTH = registerItem("miso_broth", new Item(new FabricItemSettings().food(ModFoodComponents.MISO_BROTH)));
    public static final Item MISO_SOUP = registerItem("miso_soup", new Item(new FabricItemSettings().food(ModFoodComponents.MISO_SOUP)));
    public static final Item UDON = registerItem("udon", new Item(new FabricItemSettings().food(ModFoodComponents.UDON)));
    public static final Item SILKEN_STEW = registerItem("silken_stew", new Item(new FabricItemSettings().food(ModFoodComponents.SILKEN_STEW)));

    public static final Item FAKON_RECIPE = registerItem("fakon_recipe", new Item(new FabricItemSettings()));
    public static final Item BEFF_RECIPE = registerItem("beff_recipe", new Item(new FabricItemSettings()));
    public static final Item MUTTN_RECIPE = registerItem("muttn_recipe", new Item(new FabricItemSettings()));
    public static final Item CHICKN_RECIPE = registerItem("chickn_recipe", new Item(new FabricItemSettings()));
    public static final Item HEM_RECIPE = registerItem("hem_recipe", new Item(new FabricItemSettings()));
    public static final Item RABBNT_RECIPE = registerItem("rabbnt_recipe", new Item(new FabricItemSettings()));
    public static final Item SORTA_FISHY_RECIPE = registerItem("sorta_fishy_recipe", new Item(new FabricItemSettings()));
    public static final Item CHEEZ_RECIPE = registerItem("cheez_recipe", new Item(new FabricItemSettings()));
    public static final Item NEGG_RECIPE = registerItem("negg_recipe", new Item(new FabricItemSettings()));



    private static void addItemsToIngredientsTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SOYBEAN);
        entries.add(DRIED_SOYBEAN);
        entries.add(GYPSUM);
        entries.add(SOY_MILK);
        entries.add(TOFU);
        entries.add(FAKON);
        entries.add(HEM);
        entries.add(CHICKN);
        entries.add(BEFF);
        entries.add(MUTTN);
        entries.add(RABBNT);
        entries.add(SORTA_FISHY);
        entries.add(CHEEZ);
        entries.add(NEGG);


    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(VeggieDelight.MOD_ID, name), item);
    }
    public static void registerModItems() {
        VeggieDelight.LOGGER.info("Registering Mod Items for " + VeggieDelight.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTabItemGroup);
    }
}
