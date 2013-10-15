package com.github.bdruth.example.items;

import com.github.bdruth.example.ExampleMod;

import net.minecraft.item.Item;

public class ExampleItem extends Item
{

    /**
     * Creates an Item Instance.
     * 
     * @param id
     *            The Item ID
     */
    public ExampleItem(final int id)
    {
        super(id - 256);
        setCreativeTab(ExampleMod.tabExample);
    }
}