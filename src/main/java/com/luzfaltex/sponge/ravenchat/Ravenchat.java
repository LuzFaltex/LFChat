package com.luzfaltex.sponge.ravenchat;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "ravenchat",
        name = "Ravenchat",
        description = "A feature-parity remake of VentureChat by Aust1n46 for use on Sponge",
        url = "https://github.com/ravenrockrp/RavenChat",
        authors = {
                "Foxtrek_64"
        }
)
public class Ravenchat {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
    }
}
