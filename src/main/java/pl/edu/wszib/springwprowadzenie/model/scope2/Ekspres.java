package pl.edu.wszib.springwprowadzenie.model.scope2;

import java.security.SecureRandom;

public class Ekspres {

    private final int numer = new SecureRandom().nextInt() & 100;

    public String kawa() {
        return "Kawa z ekspresu : " + numer;
    }
}
