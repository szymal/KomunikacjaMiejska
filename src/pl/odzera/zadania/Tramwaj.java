package pl.odzera.zadania;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kamilszymczak on 22.09.2016.
 */
public class Tramwaj extends Pojazdy {
    int iloscWagonow;

    public int getIloscWagonow() {
        return iloscWagonow;
    }

    public void setIloscWagonow(int iloscWagonow) {
        this.iloscWagonow = iloscWagonow;
    }
    public static List<String> zajezdnia = new ArrayList<String>();
}
