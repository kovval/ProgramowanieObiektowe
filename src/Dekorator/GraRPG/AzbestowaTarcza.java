package Dekorator.GraRPG;

public class AzbestowaTarcza extends Tarcza {
    private Tarcza _tarcza;


        public AzbestowaTarcza(){super.opis = "Azbestowa tarcza socjalizycznych ocieplen";

        }

    @Override
    public double obrona() {
        return _tarcza.obrona() + 500;
    }
}

