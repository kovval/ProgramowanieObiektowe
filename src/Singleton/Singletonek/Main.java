package Singleton.Singletonek;

public class Main {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton2 s3 = Singleton2.INSTANCE;
        Singleton2 s4 = Singleton2.INSTANCE;

        s1.name = "Janusz";
        s2.name = "Andrzej";
        s3.name = "Mirosław";
        s4.name = "Dariusz";

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
        System.out.println(s4.name);












    }
}
