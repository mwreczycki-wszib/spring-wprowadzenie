package pl.edu.wszib.springwprowadzenie.model;

import java.util.UUID;

public class Silnik {

    private String id;
    private boolean zepsuty = false;

    public Silnik() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void zepsuj() {
        zepsuty = true;
    }

    public boolean isZepsuty() {
        return zepsuty;
    }
}
