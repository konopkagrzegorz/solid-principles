package com.epam.prejap.ocp.example1;

public class DebitCard implements Payment {

    private double money;

    public DebitCard(double money) {
        this.money = money;
    }

    @Override
    public void pay(int value) {
        if (money - value >= 0) {
            money -= value;
            System.out.println("Paid by debit card: " + value);
        }
        System.out.println("No enough money, transaction cancelled");
    }
}
