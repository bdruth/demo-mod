package com.github.bdruth.example.blocks;

import com.github.bdruth.example.utils.Archive;
import com.github.bdruth.example.utils.Config;

import net.minecraft.block.Block;

public class ModBlocks
{

    public static Block block;

    /**
     * Creates all the Block Objects in the Mod.
     */
    public static void init()
    {
        block = new ExampleBlock(Config.blockID).setUnlocalizedName(Archive.block).setTextureName(Archive.block);
    }
}