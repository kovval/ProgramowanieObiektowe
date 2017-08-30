package Dekorator.Kawa;

/**
 * Created by RENT on 2017-08-30.
 */
public class Bezkofeinowa extends Kawa {

    public Bezkofeinowa() {
        super.opis = "bezkofeinowa";
    }

    @Override
    public double koszt() {
        return 1.05;
    }
}
