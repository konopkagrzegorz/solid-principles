package com.epam.prejap.lsp.example1;

public final class RectangleFactory {

    private RectangleFactory() {
    }

    public static Rectangle generateNewRectangle(int height, int width) {
        return new Rectangle(width,height);
    }

    public static Rectangle generateNewSquare(int width) {
        return new Rectangle(width,width);
    }
}
