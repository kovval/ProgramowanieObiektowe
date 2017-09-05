package Collections;

import java.util.*;

/**
 * Created by RENT on 2017-09-05.
 */
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
         int[] tablica = new int[10];
        Integer[] tablicaInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i<tablica.length; i++){
            tablica[i] = rand.nextInt(10);
        }
        for(int i = 0; i<tablicaInteger.length; i++){
            tablica[i] = rand.nextInt(10);
        }

        for(int i = 0; i<tablicaInteger.length; i++){
            System.out.println(tablicaInteger[i]);
        }

        List<Integer> list2 = Arrays.asList(tablicaInteger);
        List list1 = Arrays.asList(tablica);





        ArrayList listInt = new ArrayList();
        Collections.addAll(listInt, tablica);

        ArrayList listInteger = new ArrayList();
        Collections.addAll(listInteger, tablicaInteger);



    }
}
