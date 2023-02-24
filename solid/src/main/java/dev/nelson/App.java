package dev.nelson;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Order order = new Order();

        order.addItem(new Item("Keyboard", 1, 50));
        order.addItem(new Item("SSD", 1, 150));
        order.addItem(new Item("USB cable", 2, 5));

        System.out.println(order.totalPrice());
        order.pay("debit", "012341");
    }
}
