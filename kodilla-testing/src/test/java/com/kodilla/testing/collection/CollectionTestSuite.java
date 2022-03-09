package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: end\n");
    }

    @DisplayName("When created OddNumbersExterminator with empty list, then should return Empty list works correctly.")

    @Test
    void testCaseEmptyList() {
        List<Integer> newList = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.exterminate(newList);
        System.out.println("\nEmpty list works correctly.");
    }

    @DisplayName("When created OddNumbersExterminator with filled list, then should return Filled list works correctly.")

    @Test
    void testCaseFilledList() {
        List<Integer> newList = new ArrayList<>();

        Random random = new Random();
        for (int n=0; n<100; n++) {
            newList.add(random.nextInt(100));
        }
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.exterminate(newList);
        System.out.println("\nFilled list works correctly.");
    }
}
