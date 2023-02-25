package dev.nelson.Payment;

import dev.nelson.Order;
import dev.nelson.OrderStatus;
import dev.nelson.Authorizer.Authorizer;

public class DebitPaymentProcessor implements PaymentProcessor {

    private final String securityCode;
    private final Authorizer smsAuth;

    public DebitPaymentProcessor(final String securityCode, Authorizer auth) {
        this.securityCode = securityCode;
        this.smsAuth = auth;
    }

    @Override
    public void pay(Order order) {
        if (!this.smsAuth.isAuthorized()) {
            throw new RuntimeException("Not authorized");
        }
        System.out.println("Processing debit payment type");
        System.out.println("Verifying security code: " + securityCode);
        order.setOrderStatus(OrderStatus.PAID);
    }

}
