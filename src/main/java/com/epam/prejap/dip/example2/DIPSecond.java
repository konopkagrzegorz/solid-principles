package com.epam.prejap.dip.example2;

import java.util.logging.Logger;

public class DIPSecond {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(DIPSecond.class.getName());
        Pager pager = new Pager(logger);
        pager.sendMessage(null);
    }
}
