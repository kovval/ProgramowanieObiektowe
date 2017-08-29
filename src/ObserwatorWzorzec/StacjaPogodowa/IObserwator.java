package ObserwatorWzorzec.StacjaPogodowa;

/**
 * Created by RENT on 2017-08-29.
 */
public interface IObserwator {
    void aktualizuj(float temperatura, float cisnienie, float wilgotnosc);
}
