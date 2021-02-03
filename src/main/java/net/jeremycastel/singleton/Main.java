package net.jeremycastel.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonSeller vendeur = SingletonSeller.getInstance();
        vendeur.setLastName("smith");

        System.out.println(vendeur.getLastName());
    }
}