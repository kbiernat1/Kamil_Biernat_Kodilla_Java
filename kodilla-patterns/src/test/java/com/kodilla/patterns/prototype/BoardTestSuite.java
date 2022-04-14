package com.kodilla.patterns.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BoardTestSuite {
    @Test
    void testToString() {

        //Given
        TasksList tasksList = new TasksList("to do tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> tasksList.getTasks().add(new Task("to do task " + n)));

        TasksList tasksList1 = new TasksList("in progress tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> tasksList1.getTasks().add(new Task("in progress task " + n)));

        TasksList tasksList2 = new TasksList("done tasks");
        IntStream.iterate(1, n -> n +  1)
                .limit(10)
                .forEach(n -> tasksList2.getTasks().add(new Task("done task " + n)));

        Board board = new Board("Project number 1");
        board.getLists().add(tasksList);
        board.getLists().add(tasksList1);
        board.getLists().add(tasksList2);
        System.out.println(board);


        //making a shallow clone of object board
        Board clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        //making a deep copy of object board
        Board deepClonedBoard = null;
        try {
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        board.getLists().remove(tasksList);

        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);
        assertEquals(2, board.getLists().size());
        assertEquals(2, clonedBoard.getLists().size());
        assertEquals(3, deepClonedBoard.getLists().size());
        assertEquals(clonedBoard.getLists(), board.getLists());
        assertNotEquals(deepClonedBoard.getLists(), board.getLists());
    }
}
