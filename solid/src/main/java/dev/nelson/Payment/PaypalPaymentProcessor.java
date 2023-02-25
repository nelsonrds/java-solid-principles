package dev.nelson.Payment;

import dev.nelson.Order;
import dev.nelson.OrderStatus;

public class PaypalPaymentProcessor implements PaymentProcessor {

    private final String emailAddress;

    public PaypalPaymentProcessor(final String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void pay(Order order) {
        System.out.println("Processing paypal payment type");
        System.out.println("Verifying e-mail: " + emailAddress);
        order.setOrderStatus(OrderStatus.PAID);
    }

}
