package Collections.Zbior;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by RENT on 2017-09-05.
 */
public class zbior {
    public static void main(String[] args) {

        HashSet lista = new HashSet();
        lista.add("Kisiel");
        lista.add("Staromowa");
        lista.add("Borowya");
        lista.add("Sstegnaa");
        lista.add("Alaastera");

        HashSet lista1 = new HashSet();
        lista1.add("Kisiel");
        lista1.add("Staromowa");
        lista1.add("Borya");
        lista1.add("Sstegnaa");
        lista1.add("Alaa");

        for (Object s : lista1) {
            System.out.println(s);
        }

        String zz = String.valueOf(lista1.retainAll(lista));
        System.out.println(zz);


       TreeSet<Integer> ts = new TreeSet<>();
        ts.add(2);
        ts.add(5);
        ts.add(8);
        Integer zzz = ts.ceiling(7);
        System.out.println(zzz);


    }
}
