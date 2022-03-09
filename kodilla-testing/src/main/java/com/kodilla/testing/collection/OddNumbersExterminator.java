package com.kodilla.testing.collection;

import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        int temporaryNumber;

        System.out.print("The whole collection: ");
        for (Integer number : numbers) {
            temporaryNumber = number;
            System.out.print(temporaryNumber + " ");
        }

        System.out.print("\nEven numbers from collection above: ");

        for (Integer number : numbers) {
            temporaryNumber = number;
            if (temporaryNumber % 2 == 0) {
                System.out.print(temporaryNumber + " ");
            }
        }
        return null;
    }
}