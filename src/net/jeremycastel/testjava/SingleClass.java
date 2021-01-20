package net.jeremycastel.testjava;

import java.util.UUID;

/**
 * Singleton class with a randomly generated identifier.
 */
public class SingleClass {
    private static String uuid = null;
    private static SingleClass instance = null;

    /**
     * Private constructor used to instantiate the class and generate the
     * unique identifier.
     */
    private SingleClass() {
        super();

        SingleClass.uuid = UUID.randomUUID().toString();
    }

    /**
     * Gets the current instance. If there isn't one, instantiates the class.
     * 
     * @return The current instance
     */
    public static SingleClass getInstance() {
        if (SingleClass.uuid == null) {
            instance = new SingleClass();
        }

        return instance;
    }

    /**
     * Gets the unique identifier of the instance.
     * 
     * @return The unique identifier
     */
    public String getUuid() {
        return SingleClass.uuid;
    }
}
