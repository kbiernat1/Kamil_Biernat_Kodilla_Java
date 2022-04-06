package com.kodilla.spring.intro.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DrawerTestSuite {

    @Test
    void testDoDrawingWithCircle() {
        //given
        Circle circle = new Circle();

        //when
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();

        //then
        Assertions.assertEquals("done", result);
    }

    @Test
    void testDoDrawerWithTriangle() {
        //given
        Triangle triangle = new Triangle();

        //when
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();

        //then
        Assertions.assertEquals("done", result);
    }
}
