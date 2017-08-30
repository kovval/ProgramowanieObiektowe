package Dekorator.Kawa.Dodatki;

import Dekorator.Kawa.Kawa;
import Dekorator.Kawa.SkladnikiDekorator;

/**
 * Created by RENT on 2017-08-30.
 */
public class MleczkoSojowe extends SkladnikiDekorator {

    private Kawa _kawa;
    public MleczkoSojowe(Kawa kawa){_kawa = kawa;}

    @Override
    public String pobierzOpis() {
        return _kawa.pobierzOpis() + " Mleko sojowe, ";
    }

    @Override
    public double koszt() {
        return _kawa.koszt() + 0.15;
    }
}
