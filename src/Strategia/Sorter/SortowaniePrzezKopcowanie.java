package Strategia.Sorter;



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
            int temp = tab[0];
            tab[0] = tab[i];
            tab[i] = temp;
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

            int temp = array[maxIndex];
            array[maxIndex] = array[rodziceIndeks];
            array[rodziceIndeks] = temp;

            SortowaniePrzezKopcowanie.MaxKopca(array, wielkoscKopca, maxIndex);
        }
    }

    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
