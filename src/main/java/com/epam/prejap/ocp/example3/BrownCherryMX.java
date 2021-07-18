package com.epam.prejap.ocp.example3;

public class BrownCherryMX implements Switch {

    private final Color color;
    private final Force force;

    public BrownCherryMX(Color color, Force force) {
        this.color = color;
        this.force = force;
    }

    @Override
    public Color getSwitchColor() {
        return this.color;
    }

    @Override
    public Force getSwitchForce() {
        return this.force;
    }
}
