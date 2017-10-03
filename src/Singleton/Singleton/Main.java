package Singleton.Singleton;

/**
 * Created by RENT on 2017-09-01.
 */
public class Main {
    public static void main(String[] args) {
        Singleton sing = Singleton.getInstance();
        sing.name = "Andrzej";
        sing.time.setHour(13);


        System.out.println(sing.name +" "+ sing.time);
    }
}
