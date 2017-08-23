package ZabawyZInterfacem.Pojazd;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-23.
 */
public class Main {
    public static void main(String[] args) {
        IDwukolowy rower1 = new Rower();
        ICzterokolowy samochod1 = new Samochod();
        Motocykl motocykl1 = new Motocykl();

        motocykl1.przewrocSie();
        rower1.przewrocSie();
        samochod1.JEDZNACZOLOWKE();

        IPojazd motocykle = new Motocykl();
        IPojazd samochody = new Samochod();
        IPojazd rowery = new Rower();

        DoSth(motocykle);
        DoSth(rowery);
        DoSth(samochody);
////////////////////////////////////////////////////////////////////////////////
        ArrayList<IPojazd> myList = new ArrayList<IPojazd>();
        myList.add(motocykle);
        myList.add(rowery);
        myList.add(samochod1);

        for(IPojazd pojazd : myList) {
            DoSth(pojazd);
        }

    }

    private static void DoSth(IPojazd mobil) {
        mobil.hamuj();
    }

}
