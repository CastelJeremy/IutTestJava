package net.jeremycastel.testjava;

import java.util.logging.Logger;

/**
 * Displays a string when the afficherTexte method is called. Override and
 * Inherits the method afficherTexte from the class ClassePrincipale.
 */
public class ClasseFille extends ClassePrincipale {
    private static final Logger LOGGER = Logger.getLogger(ClasseFille.class.getName());

    public ClasseFille() {
        super();
    }

    /**
     * Displays "Ceci est la classe fille" on the console when called.
     */
    @Override
    public void afficherTexte() {
        LOGGER.info("Ceci est la classe fille");
    }
}
