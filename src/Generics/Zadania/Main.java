package Generics.Zadania;

import Dekorator.GraRPG.ObsydianowaKupaLemura;
import sun.text.bidi.BidiBase;

import java.lang.reflect.Array;
import java.util.*;

public class Main {






    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10 };

        Integer[] tab2 = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10 };

        String[] tab3   = {"c", "y", "c", "k", "i"};


        TreeSet listaHashy = new TreeSet();
        listaHashy.add("k");
        listaHashy.add("d");
        listaHashy.add("k");
        listaHashy.add("j");
        listaHashy.add("h");
        listaHashy.add("g");
        listaHashy.add("f");
        listaHashy.add("d");

        System.out.println(listaHashy);

//        List lista1 =  Arrays.asList(tab1);
//        List lista2 =  Arrays.asList(tab2);
//        List lista3 = Arrays.asList(tab3);
//
//
//        ArrayList listInteger = new ArrayList();
//        Collections.addAll(listInteger, lista1, lista2, lista3);
//        Collections.shuffle(lista1);
//        Collections.shuffle(lista3);
//        Collections.reverse(lista2);
//
//        Collections.reverse(listInteger);



//        System.out.println(listInteger);



    }

}
