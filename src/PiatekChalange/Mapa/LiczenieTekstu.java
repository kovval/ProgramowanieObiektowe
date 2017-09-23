package PiatekChalange.Mapa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class LiczenieTekstu {
    public static void main(String[] args) throws FileNotFoundException {
        String slowo;
        int liczba;
        TreeMap<String, Integer> mapWord = new TreeMap();

        File tekst = new File(".idea/tekst.txt");
        try (Scanner plik = new Scanner(new FileInputStream(tekst))) {
            while (plik.hasNext()) {
                slowo = plik.next().trim();


                String noSpecialCars = slowo.replaceAll("[\\n`*0123456789...'.,/() \":;_\\-+!?\\\\—]", " ");
                String noDoubleSpaces = noSpecialCars.replaceAll("\\s+", " ");
//                String slowoo = noDoubleSpaces.toLowerCase().replace(" ", "");
                String slowo1 = noDoubleSpaces.trim();


                    if (mapWord.containsKey(slowo1)) {
                        liczba = mapWord.get(slowo1);
                        mapWord.put( slowo1, liczba + 1);
                    }
                    else {
                        mapWord.put(slowo1, 1);
                }
            }
            if(mapWord.containsKey("")) { mapWord.remove("");}

//
//
//                for (int i = 0; i < slowo1.length(); i++) {
//                    if (mapWord.containsKey(slowo1.charAt(i))) {
//                        liczba = mapWord.get(slowo1.charAt(i));
//                        mapWord.put(slowo1.charAt(i), liczba+1);
//                    } else {
//                        mapWord.put(slowo1.charAt(i), 1);
//                    }
//                }
//            }
//        }

        }
        System.out.println(mapWord);
    }
}



