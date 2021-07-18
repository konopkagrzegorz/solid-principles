package com.epam.prejap.ocp.example2;

import java.text.DecimalFormat;

public class Calculator {

    private double firstValue;
    private double secondValue;

    public Calculator(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public void calculate(CalculationOperation calculationOperation) {
        System.out.println(calculationOperation.toString() + new DecimalFormat("#.###").format(calculationOperation.perform()));
    }
}
