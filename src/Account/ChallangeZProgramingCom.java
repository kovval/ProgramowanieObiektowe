package Account;

import java.util.Scanner;

public class ChallangeZProgramingCom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.print("[\"" + word.charAt(0));
        for (int i = 0; i < word.length() - 1; i++) {

            if (word.charAt(i) == word.charAt(i + 1)) {
                System.out.print(word.charAt(i + 1));
            } else System.out.print("\", \"" + word.charAt(i + 1));
        }
        System.out.print("\"]");
    }
}
