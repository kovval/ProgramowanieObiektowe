package WzorceZadania.ZAD2.Dekorator;

/**
 * Created by RENT on 2017-09-01.
 */
public class Main {
    public static void main(String[] args) {
        CzystySpirytus c = new CzystySpirytus();
        Woda w = new Woda(c);
        SokMalinowy s = new SokMalinowy(w);
        Tabasko tabaso = new Tabasko(s);

        System.out.printf("Stworzyłeś Wściekłego Psa %s ma on %.2f%% alkoholu", tabaso.pobierzOpis(), tabaso.alkohol());
    }
}
