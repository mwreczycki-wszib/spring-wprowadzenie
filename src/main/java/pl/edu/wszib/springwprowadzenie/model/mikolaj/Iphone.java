package pl.edu.wszib.springwprowadzenie.model.mikolaj;

public class Iphone implements Prezent{

    @Override
    public PrezentType prezentType() {
        return PrezentType.IPHONE;
    }

}
