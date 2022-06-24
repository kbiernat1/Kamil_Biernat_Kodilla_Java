package com.kodilla.patterns2.decorator.pizza;

public class AbstractPizzaOrderDecorator implements PizzaOrder {
    private final PizzaOrder pizzaOrder;

    protected AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public double getPrice() {
        return pizzaOrder.getPrice();
    }

    @Override
    public String getPizzaDescription() {
        return pizzaOrder.getPizzaDescription();
    }
}
