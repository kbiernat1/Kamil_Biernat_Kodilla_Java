package com.kodilla.kodillaspring;

import com.kodilla.spring.calculator.Calculator;
import com.kodilla.spring.calculator.Display;
import com.kodilla.spring.forum.ForumUser;
import com.kodilla.spring.library.Library;
import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;
import com.kodilla.spring.shape.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class KodillaSpringApplicationTests {

    //"exercise 10.1")
    @Test
    void testGetUsername() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser forumUser = context.getBean(ForumUser.class);

        //when
        String name = forumUser.getUsername();

        //then
        assertEquals("John Smith", name);

    }

    //"example 10.1 Shape")
    @Test
    void testCircleLoadedIntoContainer() {

        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Circle.class);

        //when
        String name = shape.getShapeName();

        //then
        assertEquals("This is circle.", name);
    }

    @Test
    void testTriangleLoadedIntoContainer() {

        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Triangle.class);

        //when
        String name = shape.getShapeName();

        //then
        assertEquals("This is triangle.", name);
    }

    //"example 10.2 Shape")
    @Test
    void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("createSquare");
        //When
        String name = shape.getShapeName();
        //Then
        assertEquals("This is square.", name);
    }

    @Test
    void testShapeLoadedIntoContainer() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("chosenShape");
        //when
        String name = shape.getShapeName();
        //then
        System.out.println("chosen shape says: " + name);
    }

    //example Library - pierwsze rozwiązanie dłuższe, drugie (save) skrócone dzięki autowired
    @Test
    void testLoadFromDb() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);

        //When
        library.loadFromDb();

        //Then
        //do nothing
    }

    /*
    @Autowired
    private Library library;

    @Test
    void testSaveToDb() {


        //When
        library.saveToDb();

        //Then
        //do nothing
    } */

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double sum = calculator.add(10, 5);
        double difference = calculator.sub(10,5);
        double multiply = calculator.mul(10, 5);
        double divide = calculator.div(10,5);

        //Then
        assertEquals(15, sum, 0.1);
        assertEquals(5, difference, 0.1);
        assertEquals(50, multiply, 0.1);
        assertEquals(2, divide,0.1);
    }
}
