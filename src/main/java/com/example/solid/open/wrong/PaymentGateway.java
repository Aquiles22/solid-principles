package com.example.solid.open.wrong;

import com.example.solid.open.Payment;

// Violación del principio
public class PaymentGateway {
    public void processPayment(Payment payment) {
        if (payment.getType() == "creditCard") { /* código para procesar pago con tarjeta de crédito */ }
        else if (payment.getType() == "paypal") { /* código para procesar pago con PayPal */ }
    }
}