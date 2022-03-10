package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.kodilla.testing.collection.OddNumbersExterminator;


@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }

    @DisplayName("When created OddNumbersExterminator with empty list, then should return Empty list works correctly.")

    @Test
    void testCaseEmptyList() {
        List<Integer> emptyListTester = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(emptyListTester);

        Assertions.assertTrue(emptyListTester.isEmpty());
    }

    @DisplayName("When created OddNumbersExterminator with filled list, then should return Filled list works correctly.")

    @Test
    void testCaseFilledList() {
        List<Integer> normalListTester = new ArrayList<>();
        normalListTester.add(1);
        normalListTester.add(2);
        normalListTester.add(3);
        normalListTester.add(4);
        normalListTester.add(5);
        normalListTester.add(6);

        List<Integer> evenListTester = new ArrayList<>();
        evenListTester.add(2);
        evenListTester.add(4);
        evenListTester.add(6);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        normalListTester = oddNumbersExterminator.exterminate(normalListTester);

        Assertions.assertEquals(normalListTester, evenListTester);
    }
}
