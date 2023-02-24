package dev.nelson;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;
    private OrderStatus orderStatus = OrderStatus.OPEN;

    public Order() {
        this.items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void addItem(final Item item) {
        this.items.add(item);
    }

    public double totalPrice() {
        return this.items.stream().map(item -> item.getQuantity() * item.getPrice()).reduce(0.0, (a, b) -> a + b);
    }

    public void pay(final String paymentType, final String securityCode) {
        if (paymentType.equals("debit")) {
            System.out.println("Processing debit payment type");
            System.out.println("Verifying security code: " + securityCode);
            this.orderStatus = OrderStatus.PAID;
        } else if (paymentType.equals("credit")) {
            System.out.println("Processing credit payment type");
            System.out.println("Verifying security code: " + securityCode);
            this.orderStatus = OrderStatus.PAID;
        } else {
            throw new RuntimeException("Unkown payment type: " + paymentType);
        }
    }

}
