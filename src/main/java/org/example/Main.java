package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext cxt=new AnnotationConfigApplicationContext(MySpringConfiguration.class);
        ExpenseTracker et=(ExpenseTracker) cxt.getBean("getEt");
        et.payRent(5000);
        et.payRecharge(250);
        et.payElectricity(200);
    }
}