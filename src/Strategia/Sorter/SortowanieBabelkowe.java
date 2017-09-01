package Strategia.Sorter;




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

    private void swap(int[]arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

