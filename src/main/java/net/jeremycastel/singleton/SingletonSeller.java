package net.jeremycastel.singleton;

public final class SingletonSeller {
    private static SingletonSeller instance = null;

    private String lastName;
    private String firstName;
    private String mail;
    private Adress adress;

    private SingletonSeller() {
        super();
    }

    public static final SingletonSeller getInstance() {
        if (SingletonSeller.instance == null) {
            SingletonSeller.instance = new SingletonSeller();
        }

        return SingletonSeller.instance;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return this.mail;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Adress getAdress() {
        return this.adress;
    }
}