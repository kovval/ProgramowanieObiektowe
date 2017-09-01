package Dekorator.GraRPG;

public class PlytkiOCB extends TarczaDekorator {
    private Tarcza _tarcza;

    public PlytkiOCB(Tarcza tarcza){_tarcza = tarcza;}


    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + " okryta płytkami OCB";
    }


    public double obrona() {
        return _tarcza.obrona() + 15.0;
    }
}
