package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    class TestingBasicFuctionality {
        @Test
        public void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(10, "Circle");
            //When
            shapeCollector.addFigure(circle);
            //Then
            Assertions.assertEquals(1, shapeCollector.getShapesListSize());
        }
        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(10, "Circle");
            shapeCollector.addFigure(circle);
            //When
            shapeCollector.removeFigure(circle);
            //Then
            Assertions.assertEquals(0, shapeCollector.getShapesListSize());
        }
    }

    @Nested
    class TestingAdvancedFunctionality {
        @Test
        public void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(10, "Circle");
            shapeCollector.addFigure(circle);
            //When
            Shape circle1 = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(circle, circle1);
        }
        @Test
        public void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(10, "Circle");
            shapeCollector.addFigure(circle);
            //When
            String content = shapeCollector.getFigure(shapeCollector.getShapesListSize()-1).toString();
            //Then
            Assertions.assertEquals(circle.toString(), content);
        }
    }
}
