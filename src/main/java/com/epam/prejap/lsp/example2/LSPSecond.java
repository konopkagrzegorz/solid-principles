package com.epam.prejap.lsp.example2;

public class LSPSecond {

    public static void main(String[] args) {
        Exercise firstExercise = new EnduranceExercise("Running",50,15);
        firstExercise.printActivityDetails();
        Exercise secondExercise = new PowerExercise("Weightlifting",80,5,3);
        secondExercise.printActivityDetails();
    }
}
