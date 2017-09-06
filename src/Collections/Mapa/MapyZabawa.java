package Collections.Mapa;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapyZabawa {
    public static void main(String[] args) {

        String[] slowa = {"a", "b", "c", "d", "e", "f", "z", "h", "i", "j", "k",};
        Integer[] liczba = {null, null, null, null, null, null, 23, null, null, null, null};
        Integer[] numberForHasgTable = {1, 2, 3, 4, 5, 6, 23, 7, 8, 9, 10};


        System.out.println("Tree MAP");
        TreeMap<String, Integer> zliczacz = new TreeMap<>();
        for (int i = 0; i < slowa.length; i++) {
            zliczacz.put(slowa[i], liczba[i]);
        }
//        zliczacz.put(null, 12);
        System.out.println(zliczacz);

        System.out.println("Hash map");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < slowa.length; i++) {
            hashMap.put(slowa[i], liczba[i]);
        }
                hashMap.put(null, 12);
                hashMap.put(null, 25);// nadpisuje wartosc (hash map to dobry słownik)
        System.out.println(hashMap);

        System.out.println("LinkedHashMap");
        LinkedHashMap<String, Integer> lhs = new LinkedHashMap<>();
        for (int i = 0; i < slowa.length; i++) {
            lhs.put(slowa[i], liczba[i]);
        }
        lhs.put(null, null);
        lhs.put(null, 12);

        System.out.println(lhs);

        System.out.println("Hashtable");
        Hashtable<String, Integer> ht = new Hashtable<>();
        for (int i = 0; i < slowa.length; i++) {
            ht.put(slowa[i], numberForHasgTable[i]);
        }
        ht.put("maria", 12);
        ht.put("null", 14 );
        ht.put(slowa[1], 12);

        System.out.println(ht);



    }
}