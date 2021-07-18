package com.epam.prejap.isp.example2;

public class Pager implements Messageable {

    @Override
    public void sendMessage(String text) {
        System.out.println(text);
    }
}
