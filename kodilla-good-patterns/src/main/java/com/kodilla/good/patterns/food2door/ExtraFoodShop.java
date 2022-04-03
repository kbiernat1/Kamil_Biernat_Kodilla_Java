package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements ProducerInterface {
    public boolean process(Order order) {
        System.out.println("Ordering " + order.getProduct().getName() + " in amount: " + order.getProduct().getAmount() + "kg. " +
                "Delivery addressed to " + getClass().getSimpleName() + ".\n");

        return true;
    }

    public void sendOrder(Order order) {
        System.out.println(getClass().getSimpleName() + " has received an order for " + order.getProduct().getName() + " in amount: " + order.getProduct().getAmount() + "kg. " );
    }
}
