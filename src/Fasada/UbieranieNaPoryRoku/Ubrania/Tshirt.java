package Fasada.UbieranieNaPoryRoku.Ubrania;

/**
 * Created by RENT on 2017-08-31.
 */
public class Tshirt implements IUbranie {
    @Override
    public void wlozUbranie() {
        System.out.println("Ubieram T-shirt");
    }

    @Override
    public void zdejmijUbranie() {
        System.out.println("Zdejmuje T-shirt");
    }
}
