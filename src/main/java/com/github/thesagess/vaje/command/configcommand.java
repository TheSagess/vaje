package com.github.thesagess.vaje.command;

import com.github.thesagess.vaje.ExampleMod;
import com.github.thesagess.vaje.config.config;
import gg.essential.api.EssentialAPI;
import gg.essential.api.commands.Command;
import gg.essential.api.commands.DefaultHandler;

public class configcommand extends Command {

    public configcommand(String name) {
        super(name);
    }

    @DefaultHandler
    public void handle() {
        EssentialAPI.getGuiUtil().openScreen(ExampleMod.instance.config.gui());
    }

}