package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeworkObserver {
    private final String mentorName;
    private int counter;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(TasksDeque tasksDeque) {
        System.out.println(mentorName + ": user " + tasksDeque.getName() + " has updated tasks queue. Total:  " + tasksDeque.getTasks().size());
        counter++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getCounter() {
        return counter;
    }
}
