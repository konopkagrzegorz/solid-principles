package com.epam.prejap.dip.example1;

public class CreditCard implements Payment {

    private final double maxCredit;
    private double credit;

    public CreditCard(double maxCredit) {
        this.maxCredit = maxCredit;
        this.credit = 0;
    }

    @Override
    public void pay(int value) {
        if (credit + value <= maxCredit) {
            System.out.println("Paid by credit card: " + value);
        }
        System.out.println("Max credit reached, transaction cancelled");
    }
}
