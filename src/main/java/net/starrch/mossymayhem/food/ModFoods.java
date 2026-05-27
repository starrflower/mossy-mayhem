package net.starrch.mossymayhem.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModFoods {
    public static final FoodProperties MOSS = new FoodProperties.Builder().nutrition(0).saturationModifier(2f).alwaysEdible().build();

    public static final Consumable MOSS_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 999), 1f)).build();



}
