package Strategia.Sorter;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-08-28.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Please enter the number of digits: ");
        int countOfNumbers = sc.nextInt();
        int[] tabTosort = new int[countOfNumbers];

        Sorter sorter = new Sorter(new quickSort());

        for(int i=0; i<countOfNumbers; i++) {
            tabTosort[i] = rd.nextInt(100);
        }

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
