package pl.edu.wszib.springwprowadzenie.model.zoo;

public class Krokodyl implements Zwierze{

    @Override
    public Gromada gromada() {
        return Gromada.GAD;
    }

    @Override
    public String nazwa() {
        return "Krokodyl";
    }

}
