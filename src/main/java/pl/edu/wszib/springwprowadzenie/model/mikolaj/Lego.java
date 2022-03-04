package pl.edu.wszib.springwprowadzenie.model.mikolaj;

public class Lego implements Prezent{

    @Override
    public PrezentType prezentType() {
        return PrezentType.LEGO;
    }

}
