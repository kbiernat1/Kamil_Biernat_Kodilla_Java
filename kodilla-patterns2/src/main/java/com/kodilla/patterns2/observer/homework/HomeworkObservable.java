package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface HomeworkObservable {
    void registerObserver(HomeworkObserver observer);
    void notifyObservers();
}
