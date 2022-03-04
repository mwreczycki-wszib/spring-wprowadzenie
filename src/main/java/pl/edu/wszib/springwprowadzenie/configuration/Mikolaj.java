package pl.edu.wszib.springwprowadzenie.configuration;

import pl.edu.wszib.springwprowadzenie.model.mikolaj.*;

public class Mikolaj {

    public DzieckoOczekujaceNaPrezent ania(Prezent prezent) {
        Ania dziecko = new Ania();
        if(!dziecko.dajPrezent(prezent)) {
            throw new RuntimeException("Zly prezent");
        }
        return dziecko;
    }

    public DzieckoOczekujaceNaPrezent kasia(Prezent prezent) {
        Kasia dziecko = new Kasia();
        if(!dziecko.dajPrezent(prezent)) {
            throw new RuntimeException("Zly prezent");
        }
        return dziecko;
    }

    public DzieckoOczekujaceNaPrezent krzys(Prezent prezent) {
        Krzys dziecko = new Krzys();
        if(!dziecko.dajPrezent(prezent)) {
            throw new RuntimeException("Zly prezent");
        }
        return dziecko;
    }

    public DzieckoOczekujaceNaPrezent tomek(Prezent prezent) {
        Tomek dziecko = new Tomek();
        if(!dziecko.dajPrezent(prezent)) {
            throw new RuntimeException("Zly prezent");
        }
        return dziecko;
    }

}
