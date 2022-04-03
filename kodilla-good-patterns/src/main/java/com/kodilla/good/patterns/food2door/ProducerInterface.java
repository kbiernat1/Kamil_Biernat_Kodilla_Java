package com.kodilla.good.patterns.food2door;

public interface ProducerInterface {
    boolean process(Order order);
    void sendOrder(Order order);
}
