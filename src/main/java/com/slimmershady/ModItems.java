package com.slimmershady;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = Identifier.of(Pandoria.MOD_ID, id);

        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return the registered item!
        return registeredItem;
    }

    public static final Item PANDONIUM = register(
            new Item(new Item.Settings()),
            "pandonium"
    );
    public static final Item PANDONIUM_NUGGET = register(new Item(new Item.Settings()), "pandonium_nugget");

    public static final Item PANDA_SWORD = register(
            new SwordItem(ModItemMaterials.PANDONIUM, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModItemMaterials.PANDONIUM, 3, -2.4f))),
            "panda_sword"
    );
    public static final Item PANDA_AXE = register(
            new AxeItem(ModItemMaterials.PANDONIUM, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModItemMaterials.PANDONIUM, 6.0F, -3.1F))),
            "panda_axe"
    );
    public static final Item PANDA_PICKCAXE = register(
            new PickaxeItem(ModItemMaterials.PANDONIUM, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModItemMaterials.PANDONIUM, 1.0F, -2.8F))),
            "panda_pickaxe"
    );
    public static final Item PANDA_SHOVEL = register(
            new ShovelItem(ModItemMaterials.PANDONIUM, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModItemMaterials.PANDONIUM, 1.5F, -3.0F))),
            "panda_shovel"
    );
    public static final Item PANDA_HOE = register(
            new HoeItem(ModItemMaterials.PANDONIUM, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModItemMaterials.PANDONIUM, -2.0F, -1.0F))),
            "panda_hoe"
    );

    public static final Item PANDONIUM_HELMET = register(new ArmorItem(ModArmorMaterials.PANDONIUM, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.PANDONIUM_DURABILITY_MULTIPLIER))), "pandonium_helmet");
    public static final Item PANDONIUM_CHESTPLATE = register(new ArmorItem(ModArmorMaterials.PANDONIUM, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.PANDONIUM_DURABILITY_MULTIPLIER))), "pandonium_chestplate");
    public static final Item PANDONIUM_LEGGINGS = register(new ArmorItem(ModArmorMaterials.PANDONIUM, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.PANDONIUM_DURABILITY_MULTIPLIER))), "pandonium_leggings");
    public static final Item PANDONIUM_BOOTS = register(new ArmorItem(ModArmorMaterials.PANDONIUM, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.PANDONIUM_DURABILITY_MULTIPLIER))), "pandonium_boots");


    public static void initialize(){

    }
}
