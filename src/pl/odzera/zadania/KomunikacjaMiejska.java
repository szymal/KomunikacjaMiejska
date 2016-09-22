package pl.odzera.zadania;

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

        Tramwaj tramwaj = new Tramwaj();
        tramwaj.setIloscWagonow(3);
        tramwaj.setZajezdnia("Tramwajowa");
        tramwaj.setMaxSpeed(30);
        tramwaj.setNumber(1);

        System.out.println("Autobus nr. "+autobus.getNumber()+" zużywa "+autobus.getZuzyciePaliwa()+
                "l/100km, jego predkość max to: " +
                autobus.getMaxSpeed()+"km/h i jego zajezdnia to: "+autobus.getZajezdnia());

        System.out.println("Tramwaj nr. "+tramwaj.getNumber()+ " ma "+tramwaj.getIloscWagonow()
                +" wagony, jego prędkość max to: "+tramwaj.getMaxSpeed()
                +"km/h i jego zajezdnia to: "+tramwaj.getZajezdnia());
    }
}
