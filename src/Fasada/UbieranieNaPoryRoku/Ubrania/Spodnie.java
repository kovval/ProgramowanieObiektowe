package Fasada.UbieranieNaPoryRoku.Ubrania;

/**
 * Created by RENT on 2017-08-31.
 */
public class Spodnie implements IUbranie {

    @Override
    public void wlozUbranie() {
        System.out.println("wkładam spodnie");
    }

    @Override
    public void zdejmijUbranie() {
        System.out.println("zdejmuje spodnie");
    }
}
