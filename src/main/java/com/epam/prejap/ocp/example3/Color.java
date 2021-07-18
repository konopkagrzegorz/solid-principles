package com.epam.prejap.ocp.example3;

public enum Color {

    RED("Red"),
    BLUE("Blue"),
    BROWN("Brown"),
    GREEN("Green");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
