package com.example.solid.open.ok;

import com.example.solid.open.Payment;

// Aplicación del principio
public interface PaymentProcessor {
    void processPayment(Payment payment);
}