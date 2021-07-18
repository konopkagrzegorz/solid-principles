package com.epam.prejap.ocp.example3;

public class KeyboardCreator {

    private Keyboard keyboard;

    public KeyboardCreator(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void changeSwitchesInKeyboard(Switch sw) {
        keyboard.setSw(sw);
    }
}
