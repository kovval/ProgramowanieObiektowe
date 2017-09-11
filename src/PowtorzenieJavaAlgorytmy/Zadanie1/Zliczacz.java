package PowtorzenieJavaAlgorytmy.Zadanie1;

public class Zliczacz {
    public static void main(String[] args) {
        String[] wordsTab = new String[args.length-1];
        char serchingCharacter = args[0].toLowerCase().charAt(0);
        int characterCounter = 0;
        for (int wordsInArray = 1; wordsInArray < args.length; wordsInArray++) {
            char[] word = args[wordsInArray].toLowerCase().toCharArray();
            for (int wordCharacters = 0; wordCharacters < word.length ; wordCharacters++) {
                if (serchingCharacter == word[wordCharacters]){
                    characterCounter++;
                }
            }
        }
        System.out.println(characterCounter);
    }
}
