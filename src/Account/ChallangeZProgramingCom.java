package Account;

import java.util.Scanner;

public class ChallangeZProgramingCom {


    private String scanText(){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        return word;
    }

    private void separateMetody(String word){
        System.out.print("[\"" + word.charAt(0));
        for (int i = 0; i < word.length() - 1; i++) {

            if (word.charAt(i) == word.charAt(i + 1)) {
                System.out.print(word.charAt(i + 1));
            } else System.out.print("\", \"" + word.charAt(i + 1));
        }
        System.out.print("\"]");
    }

    private void metodySeparator(String word){
        StringBuilder sb = new StringBuilder();
        for (int i = word.length()-1; i > 0 ; i--) {
            if (word.charAt(i) == word.charAt(i-1)) {
                sb.append(word.charAt(i-1));
            } else {
                sb.append(" ");
                sb.append(word.charAt(i-1));
            }
        }
        System.out.println(sb.reverse());


    }


    public static void main(String[] args) {
        ChallangeZProgramingCom first = new ChallangeZProgramingCom();

//        first.separateMetody( "aaasssssdddddders");
//        first.metodySeparator("dddddssssserds");
        System.out.println("..######..\n..#....#..\n..######..\n..#....#..\n..#....#..\n");

    }
}
