package com.epam.prejap.ocp.example3;

public class Keyboard  {

    private Switch sw;

    public Keyboard(Switch sw) {
        this.sw = sw;
    }

    public void setSw(Switch sw) {
        this.sw = sw;
    }

    @Override
    public String toString() {
        return String.format("Color: %s%nForce: %s%n",sw.getSwitchColor(),sw.getSwitchForce());
    }
}
