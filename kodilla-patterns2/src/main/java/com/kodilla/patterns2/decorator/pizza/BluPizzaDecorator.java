package com.kodilla.patterns2.decorator.pizza;

public class BluPizzaDecorator extends AbstractPizzaOrderDecorator {
    public BluPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 15.00;
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + ", gorgonzola, jalapeno pepper, red onion";
    }
}
