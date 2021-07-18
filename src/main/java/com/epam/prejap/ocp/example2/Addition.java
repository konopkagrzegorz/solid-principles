package com.epam.prejap.ocp.example2;

public class Addition implements CalculationOperation {

    private double firstValue;
    private double secondValue;

    public Addition(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public double perform() {
        return firstValue+secondValue;
    }

    @Override
    public String toString() {
        return "Addition Operation: ";
    }
}
