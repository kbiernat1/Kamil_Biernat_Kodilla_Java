package com.kodilla.good.patterns.food2door;

public class Product {
    private String name;
    private double amount;

    public Product(final String name, final double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }
}
