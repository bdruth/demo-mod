package com.github.bdruth.example.items;

import com.github.bdruth.example.utils.Archive;
import com.github.bdruth.example.utils.Config;

import net.minecraft.item.Item;

public class ModItems
{

    public static Item item;

    /**
     * Creates all the Item Objects in the Mod.
     */
    public static void init()
    {
        item = new ExampleItem(Config.itemID).setUnlocalizedName(Archive.item).setTextureName(Archive.item);
    }
}