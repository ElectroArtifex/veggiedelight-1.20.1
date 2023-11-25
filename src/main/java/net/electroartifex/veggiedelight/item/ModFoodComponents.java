package net.electroartifex.veggiedelight.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent SOYBEAN = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON,100), 0.7f).build();
    public static final FoodComponent TOFU = new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build();
    public static final FoodComponent SOY_MILK = new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build();
    public static final FoodComponent FAKON = new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build();
    public static final FoodComponent BEFF= new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build();
    public static final FoodComponent MUTTN = new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).build();
    public static final FoodComponent CHICKN = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent HEM = new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).build();
    public static final FoodComponent RABBNT = new FoodComponent.Builder().hunger(4).saturationModifier(0.8f).build();
    public static final FoodComponent SORTA_FISHY = new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build();
    public static final FoodComponent CHEEZ = new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build();
    public static final FoodComponent NEGG = new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build();
    public static final FoodComponent EDAMAME = new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build();
    public static final FoodComponent SILKEN_STEW = new FoodComponent.Builder().hunger(12).saturationModifier(0.8f).build();
    public static final FoodComponent UDON = new FoodComponent.Builder().hunger(14).saturationModifier(0.75f).build();
    public static final FoodComponent MISO_BROTH = new FoodComponent.Builder().hunger(8).saturationModifier(0.7f).build();
    public static final FoodComponent MISO_SOUP = new FoodComponent.Builder().hunger(12).saturationModifier(0.8f).build();
}
