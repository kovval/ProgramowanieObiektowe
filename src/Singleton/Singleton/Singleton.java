package Singleton.Singleton;

/**
 * Created by RENT on 2017-09-01.
 */
public class Singleton {
    private static Singleton _insancja;

    private Singleton(){}

    public static Singleton getInstance(){
        if(_insancja == null){
            _insancja = new Singleton();
        }
        return _insancja;
    }
}
