package com.kodilla.good.patterns.food2door;

public class OrderRetriever {
    protected Order retrieve() {
        Producer producer = new Producer(ExtraFoodShop.class.getName());
        Product product = new Product("carrots", 100);

        return new Order(producer, product);
    }
}
