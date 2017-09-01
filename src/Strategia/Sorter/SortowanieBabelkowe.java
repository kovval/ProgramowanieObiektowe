package Strategia.Sorter;


import static Strategia.Sorter.Sorter.swap;

/**
 * Created by RENT on 2017-08-28.
 */
public class SortowanieBabelkowe implements ISort {

    @Override
    public int[] sort(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                //SWAP
                if (tab[i] < tab[j]) {
                    swap( tab, i, j);
                }
            }
        }
        return tab;
    }
}

