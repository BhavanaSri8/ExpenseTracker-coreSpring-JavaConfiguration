package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpringConfiguration {

    @Bean
    public PaymentService getUpi(){
        return new UpiPaymentService();
    }

    @Bean
    public PaymentService getDc(){
        return new DebitPaymentService();
    }

    @Bean
    public PaymentService getCc(){
        return new CreditCardPaymentService();
    }
    @Bean
    public EmailService getEmail(){
        return new EmailService();
    }



    @Bean
    public ExpenseTracker getEt(@Qualifier("getDc") PaymentService ps, EmailService emailService){
        return new ExpenseTracker(ps, emailService);
    }
}
