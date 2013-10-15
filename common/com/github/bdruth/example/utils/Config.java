package com.github.bdruth.example.utils;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config
{

    /*
     * ***************************************************
     * Item IDs ***************************************************
     */
    public static int itemID;

    /*
     * ***************************************************
     * Blocks IDs ***************************************************
     */
    public static int blockID;

    /**
     * Initializes the Configuration file.
     * 
     * @param event
     *            The FMLPreInitializationEvent that is used to get the ModConfigurationDirectory.
     */
    public static void init(FMLPreInitializationEvent event)
    {

        File configFile = new File(event.getModConfigurationDirectory(), Archive.MOD_NAME + ".cfg");

        Configuration config = new Configuration(configFile);

        try
        {
            /**
             * Loads a pre-existing Configuration file.
             */
            config.load();

            configItems(config);

            configBlocks(config);

        } catch (Exception e)
        {
            FMLLog.log(Level.SEVERE, e, Archive.MOD_NAME + " has had a problem loading its configuration");
        } finally
        {
            if (config.hasChanged())
            {
                /**
                 * If a pre-existing Configuration file didn't exist it creates a new one. If there were changes to the existing Configuration file, It saves them.
                 */
                config.save();
            }
        }
    }

    /**
     * Loads or creates the Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void configItems(Configuration config)
    {
        int iID = 31000;
        itemID = config.getItem(Archive.item, iID++).getInt();
    }

    /**
     * Loads or creates the Blocks in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void configBlocks(Configuration config)
    {
        int bID = 2000;
        blockID = config.getBlock(Archive.block, bID++).getInt();
    }
}