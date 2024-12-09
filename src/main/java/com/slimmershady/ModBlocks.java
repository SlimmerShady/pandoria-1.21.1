package com.slimmershady;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static Block register(Block block, String name, boolean shouldRegisterItem){
        Identifier id = Identifier.of(Pandoria.MOD_ID, name);

        if (shouldRegisterItem){
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static final Block PANDONIUM_BLOCK = register(new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)), "pandonium_block", true);

    public static void initialize() {}
}
