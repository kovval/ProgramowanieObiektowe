package PiatekChalange.KON;

public class Nieparzyste implements IPobierzTablice {

    @Override
    public int[] pobierz(int[] tab) {
        int count = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 1) {
                count++;
            }
        }
        int[] result = new int[count];
        count = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 1) {
                result[count] = tab[i];
                count++;
            }
        }
        return result;
    }
}
