package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TasksDeque implements HomeworkObservable {
    private final List<HomeworkObserver> observers;
    private final Deque<String> tasks;
    private final String name;

    public TasksDeque(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(HomeworkObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (HomeworkObserver observer : observers) {
            observer.update(this);
        }
    }

    public Deque<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
