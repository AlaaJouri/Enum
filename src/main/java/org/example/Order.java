package org.example;

public class Order {
    private String id;


    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    private OrderStatus status;


    public Order(String id, OrderStatus status) {
        this.id = id;
        this.status = status;
    }
}
