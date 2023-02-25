package dev.nelson;

import dev.nelson.Authorizer.Authorizer;
import dev.nelson.Authorizer.NotARobot;
import dev.nelson.Authorizer.SMSAuth;
import dev.nelson.Payment.DebitPaymentProcessor;
import dev.nelson.Payment.PaymentProcessor;
import dev.nelson.Payment.PaypalPaymentProcessor;

public class App {
    public static void main(String[] args) {
        Order order = new Order();

        order.addItem(new Item("Keyboard", 1, 50));
        order.addItem(new Item("SSD", 1, 150));
        order.addItem(new Item("USB cable", 2, 5));

        System.out.println(order.totalPrice());

        NotARobot smsAuth = new NotARobot();
        smsAuth.notARobot();

        PaymentProcessor paymentProcessor = new PaypalPaymentProcessor("e@hi.t", smsAuth);
        paymentProcessor.pay(order);
    }
}
