package net.jeremycastel.testjava;

/**
 * Parent class of ClasseFille. Displays a string when the afficherTexte method
 * is called.
 */
public class ClassePrincipale {
    public ClassePrincipale() {
        super();
    }

    /**
     * Displays "Ceci est la classe principale" when called.
     */
    public void afficherTexte() {
        System.out.println("Ceci est la classe principale");
    }
}