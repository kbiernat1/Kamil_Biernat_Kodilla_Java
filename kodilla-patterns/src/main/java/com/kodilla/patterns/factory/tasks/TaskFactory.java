package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("buy", "carrots", 10);
            case PAINTING:
                return new PaintingTask("paint", "black", "it");
            case DRIVING:
                return new DrivingTask("drive", "hell", "highway");
            default:
                return null;
        }
    }
}