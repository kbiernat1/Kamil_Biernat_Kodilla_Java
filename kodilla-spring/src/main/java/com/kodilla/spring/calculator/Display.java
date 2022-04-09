package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Display {

    @Autowired
    public void displayValue(double val) {
        System.out.println("result of action: " + val);
    }
}
