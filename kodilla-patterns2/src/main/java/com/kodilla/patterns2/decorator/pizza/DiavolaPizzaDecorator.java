package com.kodilla.patterns2.decorator.pizza;

public class DiavolaPizzaDecorator extends AbstractPizzaOrderDecorator {
    public DiavolaPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 17.00;
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + ", grana padano, salami spianata, jalapeno pepper";
    }
}
