package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = calculator.add(5, 10);
        System.out.println(result1);

        if (result1 == 15) {
            System.out.println("sum OK");
        } else {
            System.out.println("sum NOK");
        }

        int result2 = calculator.subtract(6,3);
        System.out.println(result2);

        if (result2 == 3) {
            System.out.println("difference OK");
        } else {
            System.out.println("difference NOK");
        }
    }
}
