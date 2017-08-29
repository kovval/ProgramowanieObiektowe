package ObserwatorWzorzec.ObserwatorJava;




import java.util.Observable;
import java.util.Observer;

/**
 * Created by RENT on 2017-08-29.
 */
public class WarunkiBiezace implements IWyswietl, Observer {

    private float _temperatura;
    private float _cisnienie;
    private float _wilgotnosc;
    private Observable _danePogodowe;

    WarunkiBiezace(Observable danePogodowe){
        _danePogodowe = danePogodowe;
        _danePogodowe.addObserver(this);
    }

    @Override
    public void wyswietle() {
        System.out.printf("Aktualne dane: %f stC, %f hPa, %f %%\n",
                _temperatura, _cisnienie, _wilgotnosc);
    }

    @Override
    public void update(Observable o, Object arg) {
    if(o instanceof DanePogodowe) {
        DanePogodowe danePogodowe = (DanePogodowe)o;
        _temperatura = danePogodowe.getTemperatura();
        _cisnienie = danePogodowe.getCisnienie();
        _wilgotnosc = danePogodowe.getWilgotnosc();

        wyswietle();
    }
    }
}
