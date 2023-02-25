package dev.nelson.Payment;

public interface PaymentProcessorSMS extends PaymentProcessor {

    void authSMS(String code);
}
