package WzorceZadania.ZAD2.Dekorator;

/**
 * Created by RENT on 2017-09-01.
 */
public abstract class Nalewka {
    protected int alkohol;
    protected String _opis;



    public String pobierzOpis(){
        return _opis;
    }

    public  abstract double alkohol();



}
