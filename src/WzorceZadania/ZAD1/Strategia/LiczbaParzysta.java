package WzorceZadania.ZAD1.Strategia;

/**
 * Created by RENT on 2017-09-01.
 */
public class LiczbaParzysta implements ICiagLiczb {
    @Override
    public int[] ciag(int[] tab) {
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                counter++;
            }
        }
        int j = 0;
        int [] tab2 = tab;
        tab = new int[counter];
        for (int i = 0; i < tab2.length; i++) {
            if (tab2[i] % 2 == 0) {
                tab[j] = tab2[i];//paskudne ale dziala
                j++;
            }
        }
        return tab;

    }
}
