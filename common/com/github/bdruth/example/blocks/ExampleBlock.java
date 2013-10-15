package com.github.bdruth.example.blocks;

import com.github.bdruth.example.ExampleMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ExampleBlock extends Block
{

    /**
     * Creates a new Block Instance.
     * 
     * @param id
     *            The Block ID
     */
    public ExampleBlock(final int id)
    {
        super(id, Material.ground);
        setCreativeTab(ExampleMod.tabExample);
    }

    /**
     * Creates a new Block Instance.
     * 
     * @param id
     *            The Block ID
     * @param material
     *            The Material
     */
    public ExampleBlock(final int id, final Material material)
    {
        super(id, material);
        setCreativeTab(ExampleMod.tabExample);
    }
}