package com.epam.prejap.ocp.example3;

public enum Force {
    FORTY_FIVE(45),
    FIFTY_FIVE(55),
    SIXTY(60),
    SEVENTY_FIVE(75);

    private final int force;

    Force(int force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return String.valueOf(force);
    }
}
