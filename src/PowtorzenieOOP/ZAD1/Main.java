package PowtorzenieOOP.ZAD1;



/**
 * Created by RENT on 2017-08-25.
 */
public class Main {
    public static void main(String[] args) {
        MyTime czas = new MyTime(0,0,0);

        System.out.printf("%s\n",czas.toString());

//        System.out.println(czas.nextMinute());
        System.out.println(czas.previousSecond());

    }
}
