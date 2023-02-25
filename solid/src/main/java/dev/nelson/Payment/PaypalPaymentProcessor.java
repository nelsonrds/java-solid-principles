package dev.nelson.Payment;

import dev.nelson.Order;
import dev.nelson.OrderStatus;

public class PaypalPaymentProcessor implements PaymentProcessor {

    private final String emailAddress;
    private final SMSAuth smsAuth;

    public PaypalPaymentProcessor(final String emailAddress, final SMSAuth smsAuth) {
        this.emailAddress = emailAddress;
        this.smsAuth = smsAuth;
    }

    @Override
    public void pay(Order order) {
        if (!this.smsAuth.isAuthorized()) {
            throw new RuntimeException("Not authorized");
        }
        System.out.println("Processing paypal payment type");
        System.out.println("Verifying e-mail: " + emailAddress);
        order.setOrderStatus(OrderStatus.PAID);
    }

}
