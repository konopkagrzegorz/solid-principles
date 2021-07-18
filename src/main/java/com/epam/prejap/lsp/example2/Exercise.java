package com.epam.prejap.lsp.example2;


public abstract class Exercise {

    private final String name;

    public Exercise(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void printActivityDetails();
}
