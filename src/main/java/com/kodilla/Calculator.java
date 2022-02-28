package com.kodilla;

public class Calculator {
    public static void main(String[] args) {
        CalculatorAddSubtract calc = new CalculatorAddSubtract();
        System.out.println(calc.sum(74,22));
        System.out.println(calc.subtract(23, 45));
    }
}