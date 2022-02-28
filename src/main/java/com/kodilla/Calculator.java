package com.kodilla;

class CalculatorAddSubtract {
    int a;
    int b;

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}


public class Calculator {
    public static void main(String[] args) {
        CalculatorAddSubtract calc = new CalculatorAddSubtract();
        System.out.println(calc.sum(74,22));
        System.out.println(calc.subtract(23, 45));
    }
}


