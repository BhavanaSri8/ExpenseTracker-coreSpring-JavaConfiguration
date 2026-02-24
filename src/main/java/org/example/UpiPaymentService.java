package org.example;

public class UpiPaymentService implements PaymentService{

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of Rs."+amount+" using UPI method!!!!");
    }
}
