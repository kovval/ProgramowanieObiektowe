package Sorter;



/**
 * Created by RENT on 2017-08-28.
 */
public class SortowaniePrzezKopcowanie implements ISort {


    @Override
    public int[] sort(int[] tab) {

         int liczbaElementow = tab.length;
        for(int i = liczbaElementow/2 - 1; i >= 0;  i-- ) {
            SortowaniePrzezKopcowanie.MaxKopca(tab, liczbaElementow, i);
        }
        for(int i = tab.length -1; i > 0; i--) {
            SortUtils.swap( tab, 0, i);
            SortowaniePrzezKopcowanie.MaxKopca(tab, --liczbaElementow,  0);
        }

        return tab;
    }

    private static void MaxKopca(int[] array, int wielkoscKopca, int rodziceIndeks ){
        int maxIndex = rodziceIndeks;
        int leftChild = rodziceIndeks* 2 + 1;
        int rightChild = rodziceIndeks * 2 +2;

        if(leftChild < wielkoscKopca &&  array[leftChild] > array[maxIndex]){
            maxIndex = leftChild;
        }
        if(rightChild < wielkoscKopca && array[rightChild] > array[maxIndex]){
            maxIndex = rightChild;
        }
        if(maxIndex != rodziceIndeks){
            SortUtils.swap(array, maxIndex, rodziceIndeks);
            SortowaniePrzezKopcowanie.MaxKopca(array, wielkoscKopca, maxIndex);
        }
    }

}
