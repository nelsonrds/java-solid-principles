package dev.nelson.Payment;

import dev.nelson.Order;

public interface PaymentProcessor {

    // void pay(Order order, String securityCode);

    void pay(Order order);

    // moved into the PaymentProcessorSMS interface
    //void authSMS(String code);

    /**
     * This code below should be moved into the implementations
     */

    // public void payCredit(final Order order, final String securityCode) {
    // System.out.println("Processing credit payment type");
    // System.out.println("Verifying security code: " + securityCode);
    // order.setOrderStatus(OrderStatus.PAID);
    // }

    // public void payDebit(final Order order, final String securityCode) {
    // System.out.println("Processing debit payment type");
    // System.out.println("Verifying security code: " + securityCode);
    // order.setOrderStatus(OrderStatus.PAID);
    // }
}
