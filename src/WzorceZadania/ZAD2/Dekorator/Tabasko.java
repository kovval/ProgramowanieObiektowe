package WzorceZadania.ZAD2.Dekorator;

/**
 * Created by RENT on 2017-09-01.
 */
public class Tabasko extends NalewkaDekorator {
    private Nalewka _nalewka;

    public Tabasko(Nalewka nalewka){_nalewka = nalewka;}

    @Override
    public String pobierzOpis() {
        return _nalewka.pobierzOpis()+" Tabasko, trzy krople";
    }

    @Override
    public double alkohol() {
        return _nalewka.alkohol()+1;
    }
}
