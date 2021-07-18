package com.epam.prejap.dip.example1;

public class Cash implements Payment {

    int amount;

    public Cash(int amount) {
        this.amount = amount;
    }

    @Override
    public void pay(int value) {
        if (amount - value >= 0) {
            amount -= value;
            System.out.println("Paid in cash: " + value);
        }
        System.out.println("No enough money");
    }
}
