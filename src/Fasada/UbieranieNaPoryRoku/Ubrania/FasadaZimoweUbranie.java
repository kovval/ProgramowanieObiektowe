package Fasada.UbieranieNaPoryRoku.Ubrania;

import Fasada.UbieranieNaPoryRoku.IUbranieNaPoryRoku;

/**
 * Created by RENT on 2017-08-31.
 */
public class FasadaZimoweUbranie implements IUbranieNaPoryRoku {
    private Bielizna _bielizna;
    private Czapka _czapka;
    private Spodnie _spodnie;
    private Tshirt _tshirt;

    public FasadaZimoweUbranie(Bielizna biel, Czapka czap, Spodnie spod, Tshirt ts) {
        _bielizna = biel;
        _czapka = czap;
        _spodnie = spod;
        _tshirt = ts;

    }


    @Override
    public void UbierzSie() {
        _bielizna.wlozUbranie();
        _czapka.wlozUbranie();
        _spodnie.wlozUbranie();
        _tshirt.wlozUbranie();

    }

    @Override
    public void RozbierzSie() {
        _bielizna.zdejmijUbranie();
        _tshirt.zdejmijUbranie();
        _spodnie.zdejmijUbranie();
        _czapka.zdejmijUbranie();
    }
}
