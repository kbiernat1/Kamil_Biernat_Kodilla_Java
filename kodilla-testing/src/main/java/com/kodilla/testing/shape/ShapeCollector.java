package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> shapesList = new ArrayList<>();

    public int getShapesListSize() {
        return shapesList.size();
    }

    public void addFigure(Shape shape) {
        shapesList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapesList.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapesList.get(n);
    }

    public String showFigures() {
        return shapesList.toString();
    }
}
