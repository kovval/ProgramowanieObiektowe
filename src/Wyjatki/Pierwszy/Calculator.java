package Wyjatki.Pierwszy;



/**
 * Created by RENT on 2017-09-06.
 */
public class Calculator {
    public static void main(String[] args) {
        int sum = 0;
        int temp = 0;
        for (String s : args) {
            try{
                temp = Integer.parseInt(s);
            }
            catch (IllegalArgumentException e){
                System.out.println("Znaki " + s + " Nie sa liczbą");
                temp = 0;
            }
            sum += temp;
        }

        System.out.println(sum);

    }
}
