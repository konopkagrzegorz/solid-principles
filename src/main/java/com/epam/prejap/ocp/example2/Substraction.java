package com.epam.prejap.ocp.example2;

public class Substraction implements CalculationOperation {

    private double firstValue;
    private double secondValue;


    public Substraction(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public double perform() {
        return firstValue-secondValue;
    }

    @Override
    public String toString() {
        return "Substraction Operation: ";
    }
}
