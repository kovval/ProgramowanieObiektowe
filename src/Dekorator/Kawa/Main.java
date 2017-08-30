package Dekorator.Kawa;

import Dekorator.Kawa.Dodatki.BitaSmietana;
import Dekorator.Kawa.Dodatki.Czekolada;
import Dekorator.Kawa.Dodatki.MleczkoSojowe;
import Dekorator.Kawa.Dodatki.Mleko;

/**
 * Created by RENT on 2017-08-30.
 */
public class Main {
    public static void main(String[] args) {
        esspreso mp = new esspreso();
        Czekolada czek = new Czekolada(mp);
        Mleko m = new Mleko(czek);
        MleczkoSojowe ms = new MleczkoSojowe(m);
        Czekolada czek2 = new Czekolada(ms);
        BitaSmietana bS = new BitaSmietana(czek2);



        System.out.printf("Nazwa: %s :: Cena: %.2f", bS.pobierzOpis(), bS.koszt());
    }
}
