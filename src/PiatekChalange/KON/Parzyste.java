package PiatekChalange.KON;

public class Parzyste implements IPobierzTablice {


    @Override
    public int[] pobierz(int[] tab) {
        int count = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                count++;
            }
        }
        int[] result = new int[count];
        count = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                result[count] = tab[i];
                count++;
            }
        }
        return result;
    }
}
