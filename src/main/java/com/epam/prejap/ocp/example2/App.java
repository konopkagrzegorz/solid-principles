package com.epam.prejap.ocp.example2;

public class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(20,4);
        Addition addition = new Addition(20,4);
        Substraction substraction = new Substraction(10,2);
        Multiplication multiplication = new Multiplication(2,2);
        Division division = new Division(20, 3);
        calculator.calculate(addition);
        calculator.calculate(substraction);
        calculator.calculate(multiplication);
        calculator.calculate(division);
    }
}
