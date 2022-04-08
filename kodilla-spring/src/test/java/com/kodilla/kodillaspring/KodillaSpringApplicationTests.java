package com.kodilla.kodillaspring;

import com.kodilla.spring.forum.ForumUser;
import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;
import com.kodilla.spring.shape.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class KodillaSpringApplicationTests {

    @DisplayName("exercise 10.1")
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

    @DisplayName("example 10.1 Shape")
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

    @DisplayName("example 10.2 Shape")
    @Test
    void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape)context.getBean("create square");
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

}
