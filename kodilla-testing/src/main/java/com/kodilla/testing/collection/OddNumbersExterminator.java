package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> myList = new ArrayList<>();

        for (Integer nextNumbers : numbers) {
            if (nextNumbers % 2 == 0) {
                myList.add(nextNumbers);
            }
        }
        return myList;
    }
}