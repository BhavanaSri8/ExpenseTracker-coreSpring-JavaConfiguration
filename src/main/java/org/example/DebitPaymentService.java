package org.example;

public class DebitPaymentService implements PaymentService{

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of Rs."+amount+" using Debit Card method!!!!");
    }
}
