package com.github.thesagess.vaje;

import com.github.thesagess.vaje.config.config;
import gg.essential.vigilance.Vigilance;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import com.github.thesagess.vaje.command.configcommand;


@Mod(modid = "vaje", version = "1.1", useMetadata=true)
public class ExampleMod {

    public static final ExampleMod instance = new ExampleMod();
    public config config = new config();

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // Initialize and preload modules
        Vigilance.initialize();
        config.preload();

        // Registered new ExampleCommand that is activated using /example or /ex
        new configcommand("example").register();
        new configcommand("ex").register();

        MinecraftForge.EVENT_BUS.register(this);

        System.out.println("Woohoo! This example mod is working!");
    }
}
