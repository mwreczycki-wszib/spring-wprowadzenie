package pl.edu.wszib.springwprowadzenie.model.mikolaj;

public class Rower implements Prezent{

    @Override
    public PrezentType prezentType() {
        return PrezentType.ROWER;
    }

}
