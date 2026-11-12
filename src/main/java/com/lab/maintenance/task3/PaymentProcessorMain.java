package com.lab.maintenance.task3;

public class PaymentProcessorMain {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Case 1: successful payment
        processor.charge("TX-1001", 250.75);

        System.out.println("-----");

        // Case 2: failing payment, finally still clears the context
        try {
            processor.charge("TX-1002", -10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }
}