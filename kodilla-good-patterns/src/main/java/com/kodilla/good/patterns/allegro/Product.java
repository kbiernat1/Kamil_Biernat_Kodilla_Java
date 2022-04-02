package com.kodilla.good.patterns.allegro;

public class Product {
    private String name;
    private double price;
    private ProductCategory productCategory;

    public Product(String name, double price, ProductCategory productCategory) {
        this.name = name;
        this.price = price;
        this.productCategory = productCategory;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }
}
