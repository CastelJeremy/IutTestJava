package net.jeremycastel.observer;

import java.util.ArrayList;

/**
 * Observer will observe this class. When the Subject.update() will be
 * called, observer will be notified of the modification.
 */
public class Subject {
    private ArrayList<ObserverInterface> observers;
    
    public Subject() {
        super();

        this.observers = new ArrayList<>();
    }

    public boolean addObserver(ObserverInterface observer) {
        return this.observers.add(observer);
    }

    public void notifyObservers() {
        for (ObserverInterface observerInterface : observers) {
            observerInterface.wakeup();
        }
    }

    public boolean removeObserver(ObserverInterface observer) {
        return this.observers.remove(observer);
    }

    public void update() {
        this.notifyObservers();
    }
}
