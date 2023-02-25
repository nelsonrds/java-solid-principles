package dev.nelson;

import dev.nelson.Payment.DebitPaymentProcessor;
import dev.nelson.Payment.PaymentProcessor;
import dev.nelson.Payment.PaypalPaymentProcessor;
import dev.nelson.Payment.SMSAuth;

public class App {
    public static void main(String[] args) {
        Order order = new Order();

        order.addItem(new Item("Keyboard", 1, 50));
        order.addItem(new Item("SSD", 1, 150));
        order.addItem(new Item("USB cable", 2, 5));

        System.out.println(order.totalPrice());

        SMSAuth smsAuth = new SMSAuth();
        smsAuth.verify_code("code1234");

        PaymentProcessor paymentProcessor = new PaypalPaymentProcessor("e@hi.t", smsAuth);
        paymentProcessor.pay(order);
    }
}
