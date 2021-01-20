package net.jeremycastel.testjava;

import java.util.logging.Logger;

/**
 * Parent class of ClasseFille. Displays a string when the afficherTexte method
 * is called.
 */
public class ClassePrincipale {
    private static final Logger LOGGER = Logger.getLogger(ClassePrincipale.class.getName());

    public ClassePrincipale() {
        super();
    }

    /**
     * Displays "Ceci est la classe principale" when called.
     */
    public void afficherTexte() {
        SingleClass instance = SingleClass.getInstance();

        LOGGER.info("Ceci est la classe principale");
        LOGGER.info(instance.getUuid());
    }
}