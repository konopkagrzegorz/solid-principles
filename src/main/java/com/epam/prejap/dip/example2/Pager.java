package com.epam.prejap.dip.example2;

import java.util.Objects;
import java.util.logging.Logger;

public class Pager implements Messageable {

    Logger logger;

    public Pager(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void sendMessage(String text) {
        if (Objects.nonNull(text))
            System.out.println("Sending:\n" + text);
        else
            logger.warning("Null message, aborting");
    }
}
