package ObserwatorWzorzec.StacjaPogodowa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by RENT on 2017-08-29.
 */
public class DanePogodowe implements IPodmiot{
    //deklaracja zmiennych obiektowych

    private List<IObserwator> obserwatorzy;
    private float _temperatura;
    private float _cisnienie;
    private float _wilgotnosc;

        public DanePogodowe(){
            obserwatorzy = new ArrayList<>();
        }

    public void odczytyZmiennych(){
        powiadomObserwatora();
    }


    @Override
    public void zarejestrujObjekt(IObserwator obserwator) {
        obserwatorzy.add(obserwator);
    }

    @Override
    public void usunObserwatora(IObserwator obserwator) {
        obserwatorzy.remove(obserwator);
    }

    @Override
    public void powiadomObserwatora() {
        for (IObserwator obserwator : obserwatorzy) {
            obserwator.aktualizuj(_temperatura, _cisnienie, _wilgotnosc);
        }
    }

    public void ustawZmienne(float temperatura, float cisnienie, float wilgotnosc){
            _temperatura = temperatura;
            _cisnienie = cisnienie;
            _wilgotnosc = wilgotnosc;
            odczytyZmiennych();
        }

    }
    // jakas dalsza logika


