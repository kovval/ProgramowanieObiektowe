package PowtorzenieJavaAlgorytmy.Zadanie2;

import java.util.Stack;

/**
 * Created by RENT on 2017-09-07.
 */
public class Main {
    public static void main(String[] args) {

        String script = "2 * 2 + ( 3 + 5 ))";

        Stack bracketsLeft = new Stack();
        Stack bracketsRight = new Stack();

        for (int i = 0; i < script.length(); i++) {
            if (script.charAt(i) == '(') {
                bracketsLeft.push(script.charAt(i));
            }
            if (script.charAt(i) == ')') {
                bracketsRight.push(script.charAt(i));
            }
        }
        if (bracketsLeft.size() == bracketsRight.size()){
            System.out.println("prawidłowo");
        }
        else {
            System.out.println("nieprawidłowo");
        }

    }
}
