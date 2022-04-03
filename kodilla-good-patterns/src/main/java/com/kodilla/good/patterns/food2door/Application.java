package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        ProducerProcessor producerProcessor = new ProducerProcessor(new ExtraFoodShop());
        producerProcessor.forApplication(order);
    }
}
