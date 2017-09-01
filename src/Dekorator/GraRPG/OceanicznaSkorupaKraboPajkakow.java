package Dekorator.GraRPG;

public class OceanicznaSkorupaKraboPajkakow extends Tarcza {
    public OceanicznaSkorupaKraboPajkakow(){super.opis = " Oceaniczan skorupa Krabopająków ";}
    private Tarcza _tarcza;

    @Override
    public double obrona() {
        return _tarcza.obrona() + 50;
    }
}

