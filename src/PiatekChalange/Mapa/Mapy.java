package PiatekChalange.Mapa;

import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class Mapy {



    public static void main(String[] args) {
     String[] imiona = {"pawel", "adam","stefa","rosol","wieslaw","morfeusz","wieslaw","augusty","pawel" };

        HashMap<String, Integer> mapaHashy = new HashMap();
        for (int i = 0; i < imiona.length; i++) {
            mapaHashy.put(imiona[i], null);
        }
//        System.out.println(mapaHashy);

        LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();
        for (int i = 0; i < imiona.length; i++) {
            linkedMap.put(imiona[i], i);
        }
//        System.out.println(linkedMap);

        TreeMap<String, Integer> treeMapa = new TreeMap<>();
        for (int i = 0; i < imiona.length; i++) {
            treeMapa.put(imiona[i], i);
        }
        System.out.println(treeMapa);



    }

}
