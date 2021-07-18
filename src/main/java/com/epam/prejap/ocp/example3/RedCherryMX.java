package com.epam.prejap.ocp.example3;

public class RedCherryMX implements Switch {

    private final Color color;
    private final Force force;

    public RedCherryMX(Color color, Force force) {
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
