package com.slimmershady;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {
    public static final RegistryEntry<Potion> LEVITATION = Registry.registerReference(Registries.POTION, Identifier.of(Pandoria.MOD_ID, "levitation"), new Potion(new StatusEffectInstance(StatusEffects.LEVITATION, 300, 0)));
    public static final RegistryEntry<Potion> LONG_LEVITATION = Registry.registerReference(Registries.POTION, Identifier.of(Pandoria.MOD_ID, "long_levitation"), new Potion(new StatusEffectInstance(StatusEffects.LEVITATION, 900, 0)));


    public static void initialize() {
        //recipes
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(Potions.SLOW_FALLING, Items.FERMENTED_SPIDER_EYE, LEVITATION);
            builder.registerPotionRecipe(LEVITATION, Items.REDSTONE, LONG_LEVITATION);
        });


    }
}
