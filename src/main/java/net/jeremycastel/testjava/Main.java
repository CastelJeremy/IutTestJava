package net.jeremycastel.testjava;

/**
 * Main class of this project.
 */
public class Main {
    /**
     * Instantiates variables for ClassePrincipale and ClasseFille. Calls
     * method afficherTexte from both classes.
     * 
     * @param args Unused in the project
     */
    public static void main(String[] args) {
        ClassePrincipale mere = new ClassePrincipale();
        ClasseFille fille = new ClasseFille();

        mere.afficherTexte();
        fille.afficherTexte();
    }
}
