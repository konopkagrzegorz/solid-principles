package com.epam.prejap.lsp.example2;

public class PowerExercise extends Exercise {

    private int weight;
    private int sets;
    private int restInMinutes;

    public PowerExercise(String name, int weight, int sets, int restInMinutes) {
        super(name);
        this.weight = weight;
        this.sets = sets;
        this.restInMinutes = restInMinutes;
    }

    @Override
    public void printActivityDetails() {
        System.out.printf("%s%nNumber of sets: %d%nWeight in set: %d%nRest between sets: %d",super.getName(),weight,sets,restInMinutes);
    }
}
