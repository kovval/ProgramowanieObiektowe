package Dekorator.GraRPG;

public class BlachaWarszawskichTaksowek extends TarczaDekorator {
    private Tarcza _tarcza;

    public BlachaWarszawskichTaksowek(Tarcza tarcza) {
        _tarcza = tarcza;
    }

    @Override
    public String pobierzOpis() {
        return _tarcza.pobierzOpis() + ", okryta blachami z Warszawskich mercedesów E-klasa";
    }

    @Override
    public double obrona() {
        return _tarcza.obrona() + 10;
    }
}
