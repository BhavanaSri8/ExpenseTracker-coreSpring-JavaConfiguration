package org.example;

public class CreditCardPaymentService implements PaymentService{
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of Rs."+amount+" using Credit Card method!!!!");
    }
}
