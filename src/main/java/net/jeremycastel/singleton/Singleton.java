package net.jeremycastel.singleton;

/**
 * Exemple de Singleton simple avec java.
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() { }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return Singleton.instance;
    }
}
