package pl.edu.wszib.springwprowadzenie.model.mikolaj;

public class Lalka implements Prezent{
    @Override
    public PrezentType prezentType() {
        return PrezentType.LALKA;
    }
}
