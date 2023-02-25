package dev.nelson.Payment;

import dev.nelson.Order;
import dev.nelson.OrderStatus;

public class DebitPaymentProcessor implements PaymentProcessor {

    private final String securityCode;

    public DebitPaymentProcessor(final String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public void pay(Order order) {
        System.out.println("Processing debit payment type");
        System.out.println("Verifying security code: " + securityCode);
        order.setOrderStatus(OrderStatus.PAID);
    }

}
