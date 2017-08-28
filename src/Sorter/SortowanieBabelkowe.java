package Sorter;

/**
 * Created by RENT on 2017-08-28.
 */
public class SortowanieBabelkowe implements ISort {

    @Override
    public int[] sort(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                //SQAP
                if (tab[i] < tab[j]) {
                    int temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        return tab;
    }
}

