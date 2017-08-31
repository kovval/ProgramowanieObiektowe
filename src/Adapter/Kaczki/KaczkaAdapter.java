package Adapter.Kaczki;

/**
 * Created by RENT on 2017-08-31.
 */
public class KaczkaAdapter implements IIndyk {
    IKaczka _kaczka;

    public KaczkaAdapter(IKaczka kaczka) {
        _kaczka = kaczka;
    }

    @Override
    public void gulgocze() {
        _kaczka.kwacz();

    }

    @Override
    public void lata() {
        _kaczka.lataj();
    }
}
