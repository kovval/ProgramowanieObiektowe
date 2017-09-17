package ENUM.TasowanieTalli;
import PiatekChalange.Janusz.Komorka;
import com.sun.org.apache.bcel.internal.generic.SWITCH;
import javafx.util.Pair;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Talia {

    private ArrayList<Karta> talia;

    public Talia() {
        talia = new ArrayList<>();
        for (Figury figury : Figury.values()) {
            for (Kolor kolor : Kolor.values()) {
                talia.add(new Karta(figury, kolor));
            }
        }
    }

    public void drukujTalie(){
//        for (Karta karta : talia) {
//            if ( talia.indexOf(karta) % 5 == 0){
//                System.out.println();
//            }
//            System.out.print(karta.toString());
//        }

        for (int i = 0; i < talia.size(); i++) {
            if ( i % 8 == 0){
                System.out.println();
            }
            System.out.printf("%s", talia.get(i).toString() );
        }


    }

    public void tasujTalie(){
        Collections.shuffle(talia);
    }


}


