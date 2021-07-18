package com.epam.prejap.lsp.example2;

public class EnduranceExercise extends Exercise {

    private int duration;
    private int speed;

    public EnduranceExercise(String name, int duration, int speed) {
        super(name);
        this.duration = duration;
        this.speed = speed;
    }

    @Override
    public void printActivityDetails() {
        System.out.printf("%s%nDuration: %d%nAverage speed: %d%n",super.getName(),duration,speed);
    }
}
