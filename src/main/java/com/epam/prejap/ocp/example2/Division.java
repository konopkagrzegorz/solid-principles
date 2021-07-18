package com.epam.prejap.ocp.example2;

public class Division implements CalculationOperation {

    private double firstValue;
    private double secondValue;

    public Division(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public double perform() {
        if (secondValue == 0)
            throw new ArithmeticException("Cannot divide by 0");
        return firstValue/secondValue;
    }

    @Override
    public String toString() {
        return "Division Operation: ";
    }
}
