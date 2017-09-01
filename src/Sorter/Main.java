package Sorter;

/**
 * Created by RENT on 2017-08-28.
 */
public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter(new SortowaniePrzezKopcowanie());
        int[] tabTosort = {5, 3, 4, 2 ,3, 3 ,4,3, 5, 3, 19, 18, 9, 7, 6, 11, 13, 16, 63, 77, 16, 53, 12, 6, 5, 33, 28, 44, 49, 21, 20, 17, 38,
        11, 65, 29, 54, 26, 4, 15, 5, 8, 9, 13, 15, 16, 17, 19, 23};
       int[] sorted = sorter.doSorting(tabTosort);


        for(int element : sorted){
            System.out.print(element+" ");
        }
        System.out.println();
        for(int i = tabTosort.length-1; i >= 0; i--){
            System.out.print(sorted[i] + " ");
        }
    }
}
