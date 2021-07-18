package com.epam.prejap.isp.example2;

public class Phone implements Callable, Messageable {

    @Override
    public void makeCall() {
        System.out.println("Making a call");
    }

    @Override
    public void sendMessage(String text) {
        System.out.println(text);
    }
}
