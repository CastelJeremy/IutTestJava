package net.jeremycastel.observer;

public class ObserverClass implements ObserverInterface {
    @Override
    public void wakeup() {
        /**
         * Do something when the `Subject` is modified.
         */
        System.out.println("I've been notified !");
    }
}
