package com.epam.prejap.lsp.example1;

public class Rectangle {

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {return width*height;}
}
