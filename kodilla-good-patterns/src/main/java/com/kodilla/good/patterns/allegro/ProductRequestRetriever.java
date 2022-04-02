package com.kodilla.good.patterns.allegro;

public class ProductRequestRetriever {

    public ProductRequest retrieve() {
        User user = new User("John", "Doe", "johny_d");
        ProductCategory productCategory = new ProductCategory("Hand tools");
        Product product = new Product("hammer", 10.99, productCategory);

        return new ProductRequest(user, product, 10);
    }
}
