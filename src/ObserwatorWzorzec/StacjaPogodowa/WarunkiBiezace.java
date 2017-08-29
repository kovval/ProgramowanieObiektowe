package ObserwatorWzorzec.StacjaPogodowa;

import java.lang.reflect.WildcardType;

/**
 * Created by RENT on 2017-08-29.
 */
public class WarunkiBiezace implements IWyswietl, IObserwator {

    private float _temperatura;
    private float _cisnienie;
    private float _wilgotnosc;
    private IPodmiot _danePogodowe;

    WarunkiBiezace(IPodmiot danePogodowe){
        _danePogodowe = danePogodowe;
        _danePogodowe.zarejestrujObjekt(this);
    }

    @Override
    public void wyswietle() {
        System.out.printf("Aktualne dane: %f stC, %f hPa, %f %%\n",
                _temperatura, _cisnienie, _wilgotnosc);


    }

    @Override
    public void aktualizuj(float temperatura, float cisnienie, float wilgotnosc) {
        _temperatura = temperatura;
        _cisnienie = cisnienie;
        _wilgotnosc = wilgotnosc;
        wyswietle();

    }
}
