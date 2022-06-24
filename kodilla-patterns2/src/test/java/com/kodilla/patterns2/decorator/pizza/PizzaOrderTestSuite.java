package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetPrice() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        double calculatedCost = theOrder.getPrice();
        // Then
        assertEquals(15.00, calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getPizzaDescription();
        // Then
        assertEquals("Ordered a pizza with mozarella", description);
    }

    @Test
    public void testBluPizzaGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BluPizzaDecorator(theOrder);
        //When
        double calculatedCost = theOrder.getPrice();
        //Then
        assertEquals(30.00, calculatedCost);
    }

    @Test
    public void testDiavolaPizzaWithGarlicSauceGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DiavolaPizzaDecorator(theOrder);
        theOrder = new GarlicSauceDecorator(theOrder);
        //When
        String description = theOrder.getPizzaDescription();
        //Then
        assertEquals("Ordered a pizza with mozarella, grana padano, salami spianata, jalapeno pepper with garlic sauce", description);
    }
}
