package com.epam.prejap.dip.example1;

public class DIPFirst {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(
                value -> System.out.println("Ultra super gold card, paid: " + value));
        paymentService.makePayment(500);
    }
}
