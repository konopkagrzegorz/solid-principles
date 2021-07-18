package com.epam.prejap.ocp.example1;

import java.util.List;

public class App {

    public static void main(String[] args) {
        Cash cash = new Cash(500);
        DebitCard debitCard = new DebitCard(1000);
        CreditCard creditCard = new CreditCard(2000);
        List<Payment> paymentList = List.of(cash,debitCard,creditCard);


    }
}
