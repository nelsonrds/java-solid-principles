package dev.nelson.Payment;

import dev.nelson.Order;
import dev.nelson.OrderStatus;

public class DebitPaymentProcessor implements PaymentProcessorSMS {

    private final String securityCode;
    private boolean verified;

    public DebitPaymentProcessor(final String securityCode) {
        this.securityCode = securityCode;
        this.verified = false;
    }

    @Override
    public void pay(Order order) {
        if (this.verified) {
            throw new RuntimeException("Not authorized");
        }
        System.out.println("Processing debit payment type");
        System.out.println("Verifying security code: " + securityCode);
        order.setOrderStatus(OrderStatus.PAID);
    }

    @Override
    public void authSMS(String code) {
        System.out.println("Verifying SMS code: " + code);
        this.verified = true;
    }

}
