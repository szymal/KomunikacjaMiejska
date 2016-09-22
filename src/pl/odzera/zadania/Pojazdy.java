package pl.odzera.zadania;

/**
 * Created by kamilszymczak on 22.09.2016.
 */
public class Pojazdy extends KomunikacjaMiejska{
    int maxSpeed;
    int number;
    String zajezdnia;

    public String getZajezdnia() {
        return zajezdnia;
    }

    public void setZajezdnia(String zajezdnia) {
        this.zajezdnia = zajezdnia;
    }

    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
