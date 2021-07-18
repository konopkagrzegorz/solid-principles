package com.epam.prejap.dip.example1;

public class PaymentService {

    private final Payment payment;

    public PaymentService(Payment payment) {
        this.payment = payment;
    }

    public void makePayment(int value) {
        payment.pay(value);
    }
}
