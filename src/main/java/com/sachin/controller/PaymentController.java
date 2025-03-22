package com.sachin.controller;

import com.sachin.functionality.EntityProcessor;
import com.sachin.model.Payment;
import com.sachin.service.PaymentService;

import java.util.Arrays;

public class PaymentController {
    private final PaymentService paymentService = new PaymentService();

    public void addPayments() {
        Payment payment1 = new Payment(201, 101, 1, 50.0, "Credit Card", "Successful");
        Payment payment2 = new Payment(202, 102, 2, 70.0, "PayPal", "Pending");

        paymentService.processPayments(Arrays.asList(payment1, payment2));

        // Using lambda expression with Functional Interface
        EntityProcessor<Payment> processor = payment ->
                System.out.println("Processing payment: $" + payment.amount());

        processor.process(payment1);
    }
}
