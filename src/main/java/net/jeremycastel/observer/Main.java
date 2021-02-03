package net.jeremycastel.observer;

public class Main {
    public static void main(String[] args) {
        Subject sujet = new Subject();
        ObserverClass observer1 = new ObserverClass();

        sujet.addObserver(observer1);
        sujet.update();
    }
}
