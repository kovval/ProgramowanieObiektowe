package Singleton.Singleton;

/**
 * Created by RENT on 2017-09-01.
 */
public class Main {
    public static void main(String[] args) {
        Singleton sing = Singleton.getInstance();
        sing.name = "Andrzej";


        System.out.println(sing.name + " ");
    }
}
