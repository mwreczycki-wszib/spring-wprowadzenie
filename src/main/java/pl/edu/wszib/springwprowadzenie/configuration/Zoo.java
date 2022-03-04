package pl.edu.wszib.springwprowadzenie.configuration;

import pl.edu.wszib.springwprowadzenie.model.zoo.*;

public class Zoo {

    public Zwierze lew(Wybieg wybieg) {
        Zwierze zwierze = new Lew();
        if (!wybieg.dodajZwierze(zwierze)) {
            throw new RuntimeException("Zly wybieg");
        }
        return zwierze;
    }

    public Zwierze pelikan(Wybieg wybieg) {
        Zwierze zwierze = new Pelikan();
        if (!wybieg.dodajZwierze(zwierze)) {
            throw new RuntimeException("Zly wybieg");
        }
        return zwierze;
    }

    public Zwierze krokodyl(Wybieg wybieg) {
        Zwierze zwierze = new Krokodyl();
        if (!wybieg.dodajZwierze(zwierze)) {
            throw new RuntimeException("Zly wybieg");
        }
        return zwierze;
    }

    public Zwierze zaba(Wybieg wybieg) {
        Zwierze zwierze = new Zaba();
        if (!wybieg.dodajZwierze(zwierze)) {
            throw new RuntimeException("Zly wybieg");
        }
        return zwierze;
    }

}
