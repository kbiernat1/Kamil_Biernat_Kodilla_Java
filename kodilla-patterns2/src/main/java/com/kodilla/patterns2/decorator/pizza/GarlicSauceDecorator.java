package com.kodilla.patterns2.decorator.pizza;

public class GarlicSauceDecorator extends AbstractPizzaOrderDecorator{
    public GarlicSauceDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 17.00;
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " with garlic sauce";
    }
}