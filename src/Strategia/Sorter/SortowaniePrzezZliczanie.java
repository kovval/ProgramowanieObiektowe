package Strategia.Sorter;



/**
 * Created by RENT on 2017-08-28.
 */

public class SortowaniePrzezZliczanie implements ISort {

    @Override
    public int[] sort(int[] tab) {
    int max = getMax(tab);
    int[] tabIndeks = new int[max+1];
    for(int i = 0; i<tab.length; i++){
        int liczba = tab[i];
        tabIndeks[liczba]++;
    }
    int sortowanaLiczba = 0;
    for(int indeks = 0; indeks < tabIndeks.length; indeks++){
        while(tabIndeks[indeks] > 0){
            tab[sortowanaLiczba] = indeks;
            sortowanaLiczba++;
            tabIndeks[indeks]--;
        }
    }
        return tab;
    }
    private int getMax(int[] tab){
        int max = 0;
        for(int i = 0; i<tab.length;i++){
            if(max < tab[i]){
                max = tab[i];
            }
        }
        return max;
    }
}
