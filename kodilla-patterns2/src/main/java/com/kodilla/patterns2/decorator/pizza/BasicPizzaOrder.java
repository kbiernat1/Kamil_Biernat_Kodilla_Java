package com.kodilla.patterns2.decorator.pizza;

public class BasicPizzaOrder implements PizzaOrder {

    public double getPrice() {
        return 15.00;
    }

    @Override
    public String getPizzaDescription() {
        return "Ordered a pizza with mozarella";
    }
}
