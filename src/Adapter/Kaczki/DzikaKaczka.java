package Adapter.Kaczki;

/**
 * Created by RENT on 2017-08-31.
 */
public class DzikaKaczka implements IKaczka {

    @Override
    public void kwacz() {
        System.out.println("Kwa Kwa Kwa");

    }

    @Override
    public void lataj() {
        System.out.println("Fru Sru Fru");
    }
}
