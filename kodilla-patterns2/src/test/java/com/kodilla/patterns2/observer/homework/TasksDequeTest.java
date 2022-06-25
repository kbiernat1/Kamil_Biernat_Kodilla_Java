package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TasksDequeTest {

    @Test
    void testUpdate() {
        //given
        TasksDeque user1 = new User1();
        TasksDeque user2 = new User2();
        TasksDeque user3 = new User3();

        Mentor mentor1 = new Mentor("j.kowalski");
        Mentor mentor2 = new Mentor("g.wozniak");

        user1.registerObserver(mentor1);
        user2.registerObserver(mentor1);
        user3.registerObserver(mentor2);

        //when
        user1.addTask("solution to exercise 20.1");
        user1.addTask("solution to exercise 20.2");
        user2.addTask("solution to exercise 20.1");
        user3.addTask("solution to exercise 20.1");
        user3.addTask("solution to exercise 20.2");
        user3.addTask("solution to exercise 20.3");

        //then
        assertEquals(3, mentor1.getCounter());
        assertEquals(3, mentor2.getCounter());
    }
}