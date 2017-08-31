package Fasada.UbieranieNaPoryRoku;

import Fasada.UbieranieNaPoryRoku.Ubrania.FasadaZimoweUbranie;

/**
 * Created by RENT on 2017-08-31.
 */
public class StrategiaUbioru {


    private IUbranieNaPoryRoku _ubranieNaPoryRoku;

    public StrategiaUbioru(IUbranieNaPoryRoku ubranieNaPoryRoku) {
       _ubranieNaPoryRoku = ubranieNaPoryRoku;
    }

    public IUbranieNaPoryRoku getUbranieNaPoryRoku() {
        return _ubranieNaPoryRoku;
    }

    public void ubieramySie(){
        _ubranieNaPoryRoku.UbierzSie();
    }
    public  void rozbieramySie(){
        _ubranieNaPoryRoku.RozbierzSie();
    }

    public void setPoraRoku(IUbranieNaPoryRoku iUbranieNaPoryRoku){
        _ubranieNaPoryRoku = getUbranieNaPoryRoku();
    }


}
