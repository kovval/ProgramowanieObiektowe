package Collections.Lists;

import java.sql.Time;
import java.util.*;

/**
 * Created by RENT on 2017-09-05.
 */
public class Listy {
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

//        for(int i = 0; i<tablicaInteger.length; i++){
//            System.out.print(tablicaInteger[i]+" ");
//        }

        List<Integer> list2 = Arrays.asList(tablicaInteger);
        List list1 = Arrays.asList(tablica);

//        System.out.println(list1);

//        System.out.print(list2.hashCode());

//        ArrayList listInt = new ArrayList();
//        Collections.addAll(listInt, tablica);
//
//        System.out.println(listInt.hashCode());
//
        ArrayList listInteger = new ArrayList();
        Collections.addAll(listInteger, tablicaInteger);
//        Collections.reverse(listInteger);
//
        System.out.println(listInteger.hashCode());



    }
}
