package com.epam.prejap.ocp.example1;

import java.util.List;
import java.util.Random;

public class Wallet {

    private List<Payment> paymentList;

    public Wallet(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public void payForProduct(int value) {
        Payment payment = paymentList.get(new Random().nextInt(paymentList.size()));
        payment.pay(value);
    }
}
