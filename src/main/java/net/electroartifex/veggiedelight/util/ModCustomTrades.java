package net.electroartifex.veggiedelight.util;

import net.electroartifex.veggiedelight.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.PAPER, 1),
                            new ItemStack(ModItems.BEFF_RECIPE, 1),
                            4, 5, 5, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.PAPER, 1),
                            new ItemStack(ModItems.CHEEZ_RECIPE, 1),
                            4, 5, 5, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.PAPER, 1),
                            new ItemStack(ModItems.CHICKN_RECIPE, 1),
                            4, 5, 5, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.PAPER, 1),
                            new ItemStack(ModItems.FAKON_RECIPE, 1),
                            4, 5, 5, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.PAPER, 1),
                            new ItemStack(ModItems.HEM_RECIPE, 1),
                            4, 5, 5, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.PAPER, 1),
                            new ItemStack(ModItems.MUTTN_RECIPE, 1),
                            4, 5, 5, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.PAPER, 1),
                            new ItemStack(ModItems.NEGG_RECIPE, 1),
                            4, 5, 5, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.PAPER, 1),
                            new ItemStack(ModItems.RABBNT_RECIPE, 1),
                            4, 5, 5, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.PAPER, 1),
                            new ItemStack(ModItems.SORTA_FISHY_RECIPE, 1),
                            4, 5, 5, 0.075f));

                });
    }
}
