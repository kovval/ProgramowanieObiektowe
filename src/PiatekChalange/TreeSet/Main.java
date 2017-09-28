package PiatekChalange.TreeSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        String[] nazwiska = {"Mirosławski", "Adamiak", "Lesmian", "kochanowski", "WeźgoWiec", "Sira", "Misztalewski"};
        String[] nazwiska2 = {"STEFANIAK", "SZULC", "Lesmian", "kochanowski", "KISIEL", "asert", "musiala"};

        HashSet set = new HashSet();
        TreeSet set2 = new TreeSet();
        for (Object lista : nazwiska2) {
            set.add(lista.toString());
        }
        for (Object lista : nazwiska) {
            set2.add(lista.toString());
        }

        ArrayList list = new ArrayList();

        set.retainAll(set2);
        System.out.println(set);
//        int liczba = 10;
//
//
//        String slowo = "Maslo";
//        set2.add(slowo);
//        System.out.println(set2.higher(slowo));
//        System.out.println(set2);


//        for (Object o : set2) {
//            if (o.toString().length() > liczba) {
//                System.out.println(o);
//                break;
//            }
//        }


//        for (Object o : set2) {
//                if (set.contains(o)) list.add(o);
//        }
//
//
//
//
//        System.out.println(list.toString());




    }
}
