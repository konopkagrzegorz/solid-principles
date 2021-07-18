package com.epam.prejap.lsp.example1;

public class LSPFirst {
    public static void main(String[] args) {
        Rectangle square = RectangleFactory.generateNewSquare(50);
        Rectangle rectangle = RectangleFactory.generateNewRectangle(20,50);

        System.out.println("Area: " + square.area());
        System.out.println("Area: " + rectangle.area());
    }
}
