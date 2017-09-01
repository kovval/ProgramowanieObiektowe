package Strategia.Sorter;

/**
 * Created by RENT on 2017-08-28.
 */
public final class Sorter {
    private ISort _sortowanie;

    public Sorter(ISort sortowanie){
        setSortowanie(sortowanie);
    }
    public void setSortowanie(ISort sortowanie){
        _sortowanie = sortowanie;
    }
    public int[] doSorting(int[] toSort){
        return _sortowanie.sort(toSort);
    }


    public static void swap(int[]arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static int getMax(int[] tab){
        int max = 0;
        for(int i = 0; i<tab.length;i++){
            if(max < tab[i]){
                max = tab[i];
            }
        }
        return max;
    }


}
