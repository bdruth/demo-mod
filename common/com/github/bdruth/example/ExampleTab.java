package com.github.bdruth.example;

import com.github.bdruth.example.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ExampleTab extends CreativeTabs
{

    /**
     * Creates a new Creative Tab.
     * 
     * @param id
     *            The Tab ID
     * @param name
     *            The Tab Name
     */
    public ExampleTab(int id, String name)
    {
        super(id, name);
    }

    /**
     * Gets the Icon from a Item to display as the Tab's Icon
     */
    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getIconItemStack()
    {
        return new ItemStack(ModItems.item);
    }
}