package Sorter;

/**
 * Created by RENT on 2017-08-28.
 */
public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter(new SortowanieBabelkowe());
        int[] tabTosort = {5, 3, 4, 2 ,3, 3 ,4,3, 5, 3, 1, 1, 5, 5, 3, 5, 5};
       int[] sorted = sorter.doSorting(tabTosort);

        for(int element : sorted){
            System.out.print(element+" ");
        }
    }
}
