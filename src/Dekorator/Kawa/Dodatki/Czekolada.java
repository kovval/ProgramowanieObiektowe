package Dekorator.Kawa.Dodatki;

import Dekorator.Kawa.Kawa;
import Dekorator.Kawa.SkladnikiDekorator;

/**
 * Created by RENT on 2017-08-30.
 */
public class Czekolada extends SkladnikiDekorator {
    private Kawa _kawa;

    public Czekolada(Kawa kawa){
        _kawa = kawa;
    }

    @Override
    public String pobierzOpis() {
        return _kawa.pobierzOpis() +  " Czekolada, ";
    }

    @Override
    public double koszt() {
        return _kawa.koszt()+0.2;
    }
}
