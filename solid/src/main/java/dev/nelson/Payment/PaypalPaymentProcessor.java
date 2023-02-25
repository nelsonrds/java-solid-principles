package dev.nelson.Payment;

import javax.management.RuntimeErrorException;

import dev.nelson.Order;
import dev.nelson.OrderStatus;

public class PaypalPaymentProcessor implements PaymentProcessorSMS {

    private final String emailAddress;
    private boolean verified;

    public PaypalPaymentProcessor(final String emailAddress) {
        this.emailAddress = emailAddress;
        this.verified = false;
    }

    @Override
    public void pay(Order order) {
        if (this.verified) {
            throw new RuntimeException("Not authorized");
        }
        System.out.println("Processing paypal payment type");
        System.out.println("Verifying e-mail: " + emailAddress);
        order.setOrderStatus(OrderStatus.PAID);
    }

    @Override
    public void authSMS(String code) {
        System.out.println("Verifying SMS code: " + code);
        this.verified = true;
    }

}
