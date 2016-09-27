package pl.odzera.zadania;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kamilszymczak on 22.09.2016.
 */
public class KomunikacjaMiejska {
    public static void main(String[] args){

        Autobus autobus = new Autobus();
        autobus.setNumber(1);
        autobus.setZuzyciePaliwa(12.5);
        autobus.setMaxSpeed(90);
        autobus.setZajezdnia("Autobusowa");
        autobus.zajezdnia.add(autobus.getZajezdnia());
        ZajezdniaAutobus.numerAutobusu.add(autobus.getNumber());



        Autobus autobus1 = new Autobus();
        autobus1.setNumber(222);
        autobus1.setZuzyciePaliwa(12.5);
        autobus1.setMaxSpeed(90);
        autobus1.setZajezdnia("Autobusowa");
        autobus1.zajezdnia.add(autobus1.getZajezdnia());
        ZajezdniaAutobus.numerAutobusu.add(autobus1.getNumber());


        Autobus autobus2 = new Autobus();
        autobus2.setNumber(333);
        autobus2.setZuzyciePaliwa(12.5);
        autobus2.setMaxSpeed(90);
        autobus2.setZajezdnia("Autobusowa");
        autobus2.setZajezdnia("Autobusowa");
        autobus2.zajezdnia.add(autobus2.getZajezdnia());
        ZajezdniaAutobus.numerAutobusu.add(autobus2.getNumber());



        Tramwaj tramwaj = new Tramwaj();
        tramwaj.setIloscWagonow(3);
        tramwaj.setZajezdnia("Tramwajowa");
        tramwaj.setMaxSpeed(30);
        tramwaj.setNumber(997);
        tramwaj.zajezdnia.add(tramwaj.getZajezdnia());
        ZajezdniaTramwajowa.numerTramwaju.add(tramwaj.getNumber());

        System.out.println("Autobus nr. "+autobus.getNumber()+" zużywa "+autobus.getZuzyciePaliwa()+
                "l/100km, jego predkość max to: " +
                autobus.getMaxSpeed()+"km/h i jego zajezdnia to: "+autobus.getZajezdnia());

        System.out.println("Tramwaj nr. "+tramwaj.getNumber()+ " ma "+tramwaj.getIloscWagonow()
                +" wagony, jego prędkość max to: "+tramwaj.getMaxSpeed()
                +"km/h i jego zajezdnia to: "+tramwaj.getZajezdnia());

        System.out.println("Autobus nr. "+autobus1.getNumber()+" zużywa "+autobus1.getZuzyciePaliwa()+
                "l/100km, jego predkość max to: " +
                autobus1.getMaxSpeed()+"km/h i jego zajezdnia to: "+autobus1.getZajezdnia());


        System.out.println();
        System.out.println("W zajezdni: " +Tramwaj.zajezdnia.get(0)+ " są tramwaje numer: "+ZajezdniaTramwajowa.numerTramwaju);
        System.out.println("W zajezdni: " +Autobus.zajezdnia.get(0)+ " są autobusy numer: "+ZajezdniaAutobus.numerAutobusu);
    }
}
