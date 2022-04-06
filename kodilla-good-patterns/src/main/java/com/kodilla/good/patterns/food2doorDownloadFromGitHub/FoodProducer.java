package com.kodilla.good.patterns.food2doorDownloadFromGitHub;

import java.util.Map;

public interface FoodProducer {
    boolean process(Customer customer, Map<Product, Integer> productsOrders);

}