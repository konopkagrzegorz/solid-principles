package com.epam.prejap.ocp.example3;

public class App {

    public static void main(String[] args) {
        Switch blue = new BlueCherryMX(Color.BLUE,Force.FIFTY_FIVE);
        Switch red = new RedCherryMX(Color.RED,Force.FORTY_FIVE);
        Keyboard keyboard = new Keyboard(blue);
        System.out.println(keyboard);
        KeyboardCreator keyboardCreator = new KeyboardCreator(keyboard);
        keyboardCreator.changeSwitchesInKeyboard(red);
        System.out.println(keyboard);
    }
}
