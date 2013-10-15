package com.github.bdruth.example;

import com.github.bdruth.example.blocks.ModBlocks;
import com.github.bdruth.example.items.ModItems;
import com.github.bdruth.example.sided.CommonProxy;
import com.github.bdruth.example.utils.Archive;
import com.github.bdruth.example.utils.Config;
import com.github.bdruth.example.utils.Registry;
import com.github.bdruth.example.utils.handlers.LogHandler;

import net.minecraft.creativetab.CreativeTabs;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Archive.MOD_ID, name = Archive.MOD_NAME, useMetadata = true)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class ExampleMod
{
    @Instance(Archive.MOD_ID)
    public static ExampleMod instance;

    @SidedProxy(clientSide = Archive.CLIENT_PROXY, serverSide = Archive.SERVER_PROXY)
    public static CommonProxy proxy;

    // Declares a new Creative Tab
    public static CreativeTabs tabExample = new ExampleTab(CreativeTabs.getNextID(), Archive.tabExample);

    @EventHandler
    public void preInit(final FMLPreInitializationEvent evt)
    {
        LogHandler.initLog();

        Config.init(evt);

        ModItems.init();

        ModBlocks.init();
    }

    @EventHandler
    public void init(final FMLInitializationEvent evt)
    {
        Registry.register();

        proxy.initCapes();
    }
}