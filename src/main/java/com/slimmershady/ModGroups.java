package com.slimmershady;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class ModGroups {
    public static void initialize(){
        //Add all ingredient items
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> {
            itemGroup.add(ModItems.PANDONIUM);
            itemGroup.add(ModItems.PANDONIUM_NUGGET);
        });

        //Add all combat items
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> {
            itemGroup.add(ModItems.PANDA_SWORD);
            itemGroup.add(ModItems.PANDA_AXE);
            itemGroup.add(ModItems.PANDONIUM_HELMET);
            itemGroup.add(ModItems.PANDONIUM_CHESTPLATE);
            itemGroup.add(ModItems.PANDONIUM_LEGGINGS);
            itemGroup.add(ModItems.PANDONIUM_BOOTS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> {
            itemGroup.add(ModItems.PANDA_PICKCAXE);
            itemGroup.add(ModItems.PANDA_HOE);
            itemGroup.add(ModItems.PANDA_SHOVEL);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.PANDONIUM_BLOCK.asItem());
        });
    }
}
