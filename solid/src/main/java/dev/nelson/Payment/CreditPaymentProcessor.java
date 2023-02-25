package dev.nelson.Payment;

import dev.nelson.Order;
import dev.nelson.OrderStatus;

public class CreditPaymentProcessor implements PaymentProcessor {

    private final String securityCode;

    public CreditPaymentProcessor(final String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public void pay(Order order) {
        System.out.println("Processing credit payment type");
        System.out.println("Verifying security code: " + securityCode);
        order.setOrderStatus(OrderStatus.PAID);
    }

}
