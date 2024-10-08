package net.electroartifex.veggiedelight.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import vectorwing.farmersdelight.common.registry.ModEffects;


public class ModFoodComponents {
    public static final FoodComponent SOYBEAN = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON,100), 0.7f).alwaysEdible().snack().build();

    //ingredients
    public static FoodComponent DRIED_SOYBEAN = new FoodComponent.Builder().hunger(2).saturationModifier(0.8f).snack().build();
    public static FoodComponent TOFU = new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build();
    public static FoodComponent SOY_MILK = new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).alwaysEdible().build();
    public static FoodComponent FAKON = new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build();
    public static FoodComponent BEFF= new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build();
    public static FoodComponent MUTTN = new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).build();
    public static FoodComponent CHICKN = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static FoodComponent HEM = new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).build();
    public static FoodComponent RABBNT = new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build();
    public static FoodComponent SORTA_FISHY = new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build();
    public static FoodComponent CHEEZ = new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build();
    public static FoodComponent NEGG = new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build();

    //meals
    public static FoodComponent EDAMAME = new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).snack().build();

    public static FoodComponent SILKEN_STEW = new FoodComponent.Builder().hunger(12).statusEffect(new StatusEffectInstance((ModEffects.NOURISHMENT.get()),3600), 1f).alwaysEdible().build();
    public static FoodComponent UDON = new FoodComponent.Builder().hunger(12).saturationModifier(0.75f).statusEffect(new StatusEffectInstance((ModEffects.NOURISHMENT.get()),6000), 1f).alwaysEdible().build();
    public static FoodComponent MISO_BROTH = new FoodComponent.Builder().hunger(8).saturationModifier(0.7f).statusEffect(new StatusEffectInstance((ModEffects.COMFORT.get()),3600), 1f).alwaysEdible().build();
    public static FoodComponent MISO_SOUP = new FoodComponent.Builder().hunger(14).saturationModifier(0.8f).statusEffect(new StatusEffectInstance((ModEffects.COMFORT.get()),6000), 1f).alwaysEdible().build();


}
