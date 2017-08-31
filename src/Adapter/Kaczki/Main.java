package Adapter.Kaczki;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-31.
 */
public class Main {
    public static void main(String[] args) {
        DzikaKaczka kaczka = new DzikaKaczka();
        IndykDomowy indyk = new IndykDomowy();
        IndykAdapter ia2 = new IndykAdapter(indyk);

        ArrayList<IKaczka> ptaki2 = new ArrayList<>();
        ptaki2.add(kaczka);
        ptaki2.add(ia2);

        DzikaKaczka kaczka1 = new DzikaKaczka();
        KaczkaAdapter ka = new KaczkaAdapter(kaczka1);
        IndykDomowy indyk2 = new IndykDomowy();

        ArrayList<IIndyk> ptaki = new ArrayList<>();
        ptaki.add(indyk2);
        ptaki.add(ka);


        uruchomGulgotanieiLatanie(ptaki);

        uruchomKwakanieiLatanie(ptaki2);

    }

    public static void uruchomGulgotanieiLatanie(ArrayList<IIndyk> ptaki) {
        for (IIndyk indyk : ptaki) {
            indyk.gulgocze();
            indyk.lata();
        }
    }

    public static void uruchomKwakanieiLatanie(ArrayList<IKaczka> ptaki2){
        for (IKaczka kaczka : ptaki2) {
            kaczka.kwacz();
            kaczka.lataj();
        }
    }
}
