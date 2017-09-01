package Dekorator.GraRPG;

/**
 * Created by RENT on 2017-08-30.
 */
public abstract class Miecz {
    protected String opis;
//    protected double atak;

    public String pobierzOpis() {
        return opis;
    }

    public abstract double atak();
}
