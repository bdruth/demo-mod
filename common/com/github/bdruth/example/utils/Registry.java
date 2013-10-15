package com.github.bdruth.example.utils;

import com.github.bdruth.example.blocks.ModBlocks;
import com.github.bdruth.example.items.ModItems;
import com.github.bdruth.example.utils.handlers.RecipeHandler;

import cpw.mods.fml.common.registry.GameRegistry;

public class Registry
{

    /**
     * Registers everything that needs to be Registered.
     */
    public static void register()
    {

        registerBlocks();

        registerItems();

        RecipeHandler.init();
    }

    /**
     * Registers all the Blocks.
     */
    private static void registerBlocks()
    {

        GameRegistry.registerBlock(ModBlocks.block, "Block_TEST");
    }

    /**
     * Registers all the Items.
     */
    private static void registerItems()
    {

        GameRegistry.registerItem(ModItems.item, "Item_TEST");
    }
}