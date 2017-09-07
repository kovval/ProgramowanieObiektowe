package Collections.Mapa;

import sun.plugin2.message.GetAuthenticationMessage;


import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.*;

/**
 * Created by RENT on 2017-09-05.
 */
public class MapaZadaie {
    public static void main(String[] args) throws IOException {


        String text = "";
        text = readFile(".idea/tekst.txt");
//        URL url = new URL("http://wolnelektury.pl/media/book/txt/lalka-tom-pierwszy.txt");
//        Scanner s = new Scanner(url.openStream());
//        String text = s.toString();
//        System.out.println(countChars(text));
//        System.out.println(countWords(text));
        TreeMap<String, Integer> wordColumn = countWords(text);
        printSorted(wordColumn);
    }
    private static String readFile(String name) throws IOException {
        Scanner input = null;
        StringBuilder builder = new StringBuilder();

        try {
            Path path = Paths.get(name);
            input = new Scanner(path);

            while (input.hasNextLine()) {
                builder.append(input.nextLine());
            }

        } finally {
            if (input != null) {
                input.close();
            }
        }
        return builder.toString();

    }

    public static TreeMap<Character, Integer> countChars(String text) {

        TreeMap<Character, Integer> charsInText = new TreeMap<>();

        String noWhitespace = text.trim();
        String noSpecialCars = noWhitespace.replaceAll("[\\n.,/()\":;_\\-+!?\\\\—]", " ");
        String noDoubleSpaces = noSpecialCars.replaceAll("\\s+", " ");
        String lowerCase = noDoubleSpaces.toLowerCase();
        char[] chars = lowerCase.toCharArray();


        for (Character czar : chars) {
            if (charsInText.containsKey(czar)) {
                int occurrences = charsInText.get(czar);
                charsInText.put(czar, occurrences + 1);
            } else {
                charsInText.put(czar, 1);
            }
        }

        return charsInText;
    }
    public static TreeMap<String, Integer> countWords(String text) {

        TreeMap<String, Integer> wordsInText = new TreeMap<>();

        String noWhitespace = text.trim();
        String noSpecialCars = noWhitespace.replaceAll("[\\n—..,„”…/()\":;_\\-+!?\\\\]", " ");
        String noDoubleSpaces = noSpecialCars.replaceAll("\\s+", " ");
        String lowerCase = noDoubleSpaces.toLowerCase();
        String[] words = lowerCase.split(" ");



        for (String word : words) {
            if (wordsInText.containsKey(word)) {
                int occurrences = wordsInText.get(word);
                wordsInText.put(word, occurrences + 1);
            } else {
                wordsInText.put(word, 1);
            }

        }

        return wordsInText;
    }
    public static void printSorted(TreeMap<String, Integer> map) {
        map.entrySet().stream().sorted((W, K) -> K.getValue()
                .compareTo(W.getValue())).forEach(e -> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));
    }
}



