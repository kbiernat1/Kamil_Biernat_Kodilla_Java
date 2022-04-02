package com.kodilla.good.patterns.allegro;

public class ProductRequest {
    private User user;
    private Product product;
    private int amount;

    public ProductRequest(User user, Product product, int amount) {
        this.user = user;
        this.product = product;
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }
}
