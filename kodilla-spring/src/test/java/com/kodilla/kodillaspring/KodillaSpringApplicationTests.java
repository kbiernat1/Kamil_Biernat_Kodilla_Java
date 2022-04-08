package com.kodilla.kodillaspring;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class KodillaSpringApplicationTests {

    @Test
    void testCircleLoadedIntoContainer() {

        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Circle.class);

        //when
        String name = shape.getShapeName();

        //then
        Assertions.assertEquals("This is circle.", name);
    }


    @Test
    void testTriangleLoadedIntoContainer() {

        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Triangle.class);

        //when
        String name = shape.getShapeName();

        //then
        Assertions.assertEquals("This is triangle.", name);
    }

}
