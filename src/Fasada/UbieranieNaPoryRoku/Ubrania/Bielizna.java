package Fasada.UbieranieNaPoryRoku.Ubrania;

/**
 * Created by RENT on 2017-08-31.
 */
public class Bielizna implements IUbranie {


    @Override
    public void wlozUbranie() {
        System.out.println("Wkładam bielizne");
    }

    @Override
    public void zdejmijUbranie() {
        System.out.println("nie zdejmuje bielizny bo jest dopiero środa");
    }
}
