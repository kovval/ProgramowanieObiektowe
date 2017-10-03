package Singleton.Singleton;

import Time.Time;

/**
 * Created by RENT on 2017-09-01.
 */
public class Singleton {
    private static Singleton insancja = null;

    String name;
    Time time = new Time(12,12,12);


    private Singleton(){}

    public static Singleton getInstance(){
        if(insancja == null){
            insancja = new Singleton();
        }

        return insancja;
    }
}
