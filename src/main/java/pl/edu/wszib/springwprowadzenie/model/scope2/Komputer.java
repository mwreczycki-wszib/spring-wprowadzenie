package pl.edu.wszib.springwprowadzenie.model.scope2;

public class Komputer {

    private boolean zajety = false;

    public String pracuj() {
        if (zajety) {
            return "Zajety";
        } else {
            zajety = true;
            return "Pracuje";
        }
    }

}
