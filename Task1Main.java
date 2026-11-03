package com.mycompany.lab07;

public class Task1Main {

    public static void main(String[] args) {

        System.out.println("===== TASK 1: PAYMENT SYSTEM =====");

        // Credit Card Payment
        PaymentMethod creditCard = new CreditCardPayment();

        EcommerceCart cart1 = new EcommerceCart(creditCard);

        cart1.checkout(2500.0);

        System.out.println();

        // JazzCash Payment
        PaymentMethod jazzCash = new JazzCashPayment();

        EcommerceCart cart2 = new EcommerceCart(jazzCash);

        cart2.checkout(1500.0);

    }
}