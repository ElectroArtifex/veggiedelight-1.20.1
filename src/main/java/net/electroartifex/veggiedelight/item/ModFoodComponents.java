package net.electroartifex.veggiedelight.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent SOYBEAN = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON,100), 0.7f).build();
    public static final FoodComponent TOFU = new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build();
}
