package pl.edu.wszib.springwprowadzenie.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Samochod {

    private static final Logger logger = LoggerFactory.getLogger(Samochod.class);

    private final Silnik silnik = new Silnik();

    public void odpal() {
        if(silnik == null) {
            logger.info("Brakuje silnika");
            return;
        }

        if(silnik.isZepsuty()) {
            logger.info("Silnik nie dziala");
            return;
        }

        logger.info("Odpalilem");


    }

    public Silnik getSilnik() {
        return silnik;
    }
}
