package de.leximon.fuqsignature;

import com.google.inject.Inject;
import org.apache.logging.log4j.Logger;
import space.vectrix.ignite.api.Platform;
import space.vectrix.ignite.api.event.Subscribe;
import space.vectrix.ignite.api.event.platform.PlatformInitializeEvent;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public class FuqSignatureMod {
    private final Logger logger;
    private final Platform platform;

    @Inject
    public FuqSignatureMod(Logger logger, Platform platform) {
        this.logger = logger;
        this.platform = platform;
    }

    @Subscribe
    public void onInitialize(PlatformInitializeEvent event) {
        this.logger.info("Fuq off the chat signature has been initialized!");
    }
}
