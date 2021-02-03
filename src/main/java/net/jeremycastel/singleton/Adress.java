package net.jeremycastel.singleton;

public class Adress {
    private final Integer number;
    private final String street;
    private final String city;
    private final Integer postal;

    public Adress (Integer number, String street, String city, Integer postal) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.postal = postal;
    }
}
