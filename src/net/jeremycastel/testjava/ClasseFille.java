package net.jeremycastel.testjava;

/**
 * Displays a string when the afficherTexte method is called. Override and
 * Inherits the method afficherTexte from the class ClassePrincipale.
 */
public class ClasseFille extends ClassePrincipale {
    public ClasseFille() {
        super();
    }

    /**
     * Displays "Ceci est la classe fille" on the console when called.
     */
    @Override
    public void afficherTexte() {
        System.out.println("Ceci est la classe fille");
    }
}
