package WzorceZadania.ZAD2.Dekorator;

/**
 * Created by RENT on 2017-09-01.
 */
public class CzystySpirytus extends Nalewka {
    public CzystySpirytus() { super._opis = "Najczystszy spiryt na rynku";}

    @Override
    public double alkohol() {
        return 95.6;
    }
}
