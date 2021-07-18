package com.epam.prejap.ocp.example2;

public class Multiplication implements CalculationOperation {

    private double firstValue;
    private double secondValue;

    public Multiplication(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public double perform() {
        return firstValue*secondValue;
    }

    @Override
    public String toString() {
        return "Multiplication Operation: ";
    }
}
