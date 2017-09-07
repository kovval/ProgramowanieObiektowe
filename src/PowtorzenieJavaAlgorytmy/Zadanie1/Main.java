package PowtorzenieJavaAlgorytmy.Zadanie1;

/**
 * Created by RENT on 2017-09-07.
 */
public class Main {
    public static void main(String[] args) {

        String[] wordsTable = new String[args.length - 1];
        int count = 0;
        char serchingCharacter = args[0].toLowerCase().charAt(0);
        for (int wordCounter = 1; wordCounter < args.length; wordCounter++) {

            String word = args[wordCounter].toLowerCase();
            char[] lettersInWord = word.toCharArray();
            for (int letterscounter = 0; letterscounter < lettersInWord.length; letterscounter++) {
                if (lettersInWord[letterscounter] == serchingCharacter) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}

