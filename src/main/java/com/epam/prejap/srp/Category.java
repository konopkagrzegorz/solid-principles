package com.epam.prejap.srp;

public enum Category {

    ACTION_AND_ADVENTURE("Action and Adventure"),
    CLASSICS("Classics"),
    COMIC("Comic"),
    NOVEL("Novel"),
    HISTORICAL_FICTION("Historical Fiction"),
    FANTASY("Fantasy"),
    HORROR("Horror");

    private String name;

    Category(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
