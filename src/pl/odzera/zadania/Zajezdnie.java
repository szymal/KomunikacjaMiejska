package pl.odzera.zadania;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kamilszymczak on 22.09.2016.
 */
public class Zajezdnie {
    String nazwa;

    public void dodajPojazd(Pojazdy pojazdy){
        this.listaPojazdow.add(pojazdy);

    }

    private List<Pojazdy> listaPojazdow = new ArrayList<>();

    public List<Pojazdy> getPojazd() {
        return listaPojazdow;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }



}
