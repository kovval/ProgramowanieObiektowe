package Fasada.FasadaTunerWzmacniacz;

/**
 * Created by RENT on 2017-08-31.
 */
public class FasadaKinaDomowego {
    private Telewizor _tv;
    private Termomix _termomix;
    private Tuner _tuner;
    private WzmacniaczDVD _wzmacniaczDVD;

    public FasadaKinaDomowego(Telewizor tv,
                              Termomix tx,
                              WzmacniaczDVD dvd,
                              Tuner tuner) {
        _tv = tv;
        _termomix = tx;
        _tuner = tuner;
        _wzmacniaczDVD = dvd;
    }

    public void wrocDodomu(){
        _termomix.wlacz();
        _tuner.wlacz();
        _tv.wlacz();
        _tv.ustawGlosnoc();
        _tv.ustawkanal();
        _termomix.wlacz();
        _termomix.zrobKurczaka();
    }
    public void wychodzZDomu(){
        _termomix.wylacz();
        _tv.wylacz();
        _tuner.wylacz();
        _wzmacniaczDVD.wylacz();
    }

}
