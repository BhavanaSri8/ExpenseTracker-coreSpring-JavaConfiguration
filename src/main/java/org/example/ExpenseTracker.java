package org.example;

public class ExpenseTracker {

    PaymentService paymentService;
    EmailService emailService;

    public ExpenseTracker(PaymentService paymentService, EmailService emailService) {
        this.paymentService = paymentService;
        this.emailService = emailService;
    }

        public void payRent(double amount){
            emailService.notification("Going to pay rent");
            System.out.println("Pay Rent of Rs."+amount);
            paymentService.makePayment(amount);
        }

        public void payElectricity(double amount){
            emailService.notification("Going to pay Electricity Bill");
            System.out.println("Pay Electricity Bill of Rs."+amount);
            paymentService.makePayment(amount);
        }

        public void payRecharge(double amount){
            emailService.notification("Going to Recharge..");
            System.out.println("Recharge mobile with Rs."+amount);
            paymentService.makePayment(amount);
        }


    }



