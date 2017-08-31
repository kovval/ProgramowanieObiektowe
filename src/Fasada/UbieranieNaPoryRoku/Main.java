package Fasada.UbieranieNaPoryRoku;

import Fasada.UbieranieNaPoryRoku.Ubrania.*;

/**
 * Created by RENT on 2017-08-31.
 */
public class Main {
    public static void main(String[] args) {
        Bielizna biel = new Bielizna();
        Czapka czap = new Czapka();
        Spodnie spod = new Spodnie();
        Tshirt ts = new Tshirt();

        FasadaZimoweUbranie flu = new FasadaZimoweUbranie(biel, czap, spod, ts);
        StrategiaUbioru su = new StrategiaUbioru(flu);


        su.ubieramySie();
        su.rozbieramySie();

    }
}
