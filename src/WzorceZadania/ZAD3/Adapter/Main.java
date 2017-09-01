package WzorceZadania.ZAD3.Adapter;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-09-01.
 */
public class Main {
    public static void main(String[] args) {
        Tasimo tas = new Tasimo();
        DolceGusto dol = new DolceGusto();
        DolceGustoToTasimoADAPTER dtt = new DolceGustoToTasimoADAPTER(dol);

        ArrayList<ITasimo> kawka = new ArrayList<>();
        kawka.add(tas);
        kawka.add(dtt);

        wcisnijkapsule(kawka);

    }
    public static void wcisnijkapsule(ArrayList<ITasimo> kawka) {
        for (ITasimo kawa : kawka) {
            kawa.kapsulka();
        }
    }

}
