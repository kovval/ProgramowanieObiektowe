package Dekorator.GraRPG;

public class ObsydianowaKupaLemura extends TarczaDekorator {


    private Tarcza _tarcza;

    public ObsydianowaKupaLemura(Tarcza tarcza) {
        _tarcza = tarcza;
    }


    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + " , wzmocniona obsydianowymi kupami lemurów";
    }

    @Override
    public double obrona() {
        return _tarcza.obrona() + 15;
    }
}
