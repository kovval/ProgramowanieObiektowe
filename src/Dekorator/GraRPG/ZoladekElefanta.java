package Dekorator.GraRPG;

public class ZoladekElefanta extends  Plecak {
    private Plecak _plecak;

    public ZoladekElefanta(){super.opis = " Żołądek elefanta";}

    @Override
    public double ladunek() {
        return 400;
    }
}
