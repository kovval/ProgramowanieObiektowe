package WzorceZadania.ZAD2.Dekorator;

/**
 * Created by RENT on 2017-09-01.
 */
public class Woda extends NalewkaDekorator {
    private Nalewka _nalewka;

    public Woda(Nalewka nalewka){_nalewka = nalewka;}

    @Override
    public String pobierzOpis() {
        return _nalewka.pobierzOpis()+" woda, nie wóda";
    }

    @Override
    public double alkohol() {
        return _nalewka.alkohol()-30.7;
    }
}
