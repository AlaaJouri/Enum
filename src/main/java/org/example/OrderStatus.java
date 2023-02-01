package org.example;

public enum OrderStatus {
    RECEIVED("Received"),
    IN_PROGRESS("In Progress"),
    IN_DELIVERY("In Delivery"),
    COMPLETED("Completed"),
    CANCELED("Canceled");
private String x;

    OrderStatus(String x) {
        this.x = x;
    }


    @Override
    public String toString() {
        return "OrderStatus{" +
                "x='" + x + '\'' +
                '}';
    }
}
