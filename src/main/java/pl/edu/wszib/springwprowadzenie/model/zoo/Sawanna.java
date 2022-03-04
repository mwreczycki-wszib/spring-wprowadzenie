package pl.edu.wszib.springwprowadzenie.model.zoo;

import java.util.Arrays;
import java.util.List;

public class Sawanna implements Wybieg{

    @Override
    public List<Gromada> wybiegDla() {
        return Arrays.asList(Gromada.SSAK);
    }

}
