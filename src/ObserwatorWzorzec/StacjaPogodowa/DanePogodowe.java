package ObserwatorWzorzec.StacjaPogodowa;

/**
 * Created by RENT on 2017-08-29.
 */
public class DanePogodowe {
    //deklaracja zmiennych obiektowych
    public void odczytyZmiennych(){

        float temperatura = pobierzTemperature();
        float cisnienie = pobierzCisnienie();
        float wilgotnosc = pobierzwilgotnosc();

        warunkiBiezaceWyswiet.aktualizuj(temperatura, cisnienie, wilgotnosc);

        statystykaWyswietlania.aktualizuj(temperatura, cisnienie, wilgotnosc);

        prognozaWyswietl.aktualizuj(temperatura, cisnienie, wilgotnosc);

    }
    // jakas dalsza logika

}
