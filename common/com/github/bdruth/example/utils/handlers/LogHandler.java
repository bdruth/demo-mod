package com.github.bdruth.example.utils.handlers;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.github.bdruth.example.utils.Archive;

import cpw.mods.fml.common.FMLLog;

public class LogHandler
{
    /*
     * Log Stuff
     */
    private static Logger logger = Logger.getLogger(Archive.MOD_ID);

    /**
     * Initializes the Logger for this Mod.
     */
    public static void initLog()
    {

        logger.setParent(FMLLog.getLogger());
    }

    /**
     * Logs a Object.
     */
    public static void log(final Level logLevel, final Object message)
    {

        LogHandler.log(logLevel, message.toString());
    }

    /**
     * Logs a Object, and a Throwable.
     */
    public static void log(final Level level, final String msg, final Throwable t)
    {
        LogHandler.log(level, msg, t);
    }
}