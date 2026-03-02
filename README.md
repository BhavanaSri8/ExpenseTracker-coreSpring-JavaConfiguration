# 🌱 Spring Java Configuration - Expense Tracker

## 📌 Overview

A Spring-based Expense Tracking application demonstrating **Java-based configuration**, **constructor injection**, and **multiple payment service implementations** using the Spring Framework.

This project showcases how to configure Spring using `@Configuration` and `@Bean` annotations instead of XML.

---

## 🚀 Features

- ✅ Multiple Payment Methods:
  - UPI
  - Debit Card
  - Credit Card
- ✅ Email Notifications before each payment
- ✅ Constructor-based Dependency Injection
- ✅ Java-based Spring Configuration (No XML)
- ✅ Clean separation of concerns

---

## 🏗️ Project Architecture

### 📂 Components

### 🔹 Services Layer

- `PaymentService` → Interface for payment operations
- `UpiPaymentService` → UPI payment implementation
- `DebitPaymentService` → Debit card payment implementation
- `CreditCardPaymentService` → Credit card payment implementation
- `EmailService` → Sends notification before payment

---

### 🔹 Core Layer

- `ExpenseTracker` → Main application logic for handling payments
- `MySpringConfiguration` → Spring configuration class using annotations

---


<img width="1079" height="436" alt="image" src="https://github.com/user-attachments/assets/32e811af-6308-4431-ba44-4feb16190bfc" />
