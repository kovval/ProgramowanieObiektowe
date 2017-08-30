package ObserwatorWzorzec.Gazeta;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-30.
 */
public class KaczorDonald implements IWadawcaPodmiot {
    private ArrayList<IObserwatorOdbiorca> _odbiorcy;
    private String _numer;

    public KaczorDonald(){
        _odbiorcy = new ArrayList<>();
    }

    @Override
    public void dodajOdbiorcaObserwator(IObserwatorOdbiorca prenumerator) {
        _odbiorcy.add(prenumerator);
    }

    @Override
    public void usunOdbiorcaObserwator(IObserwatorOdbiorca prenumerator) {
        _odbiorcy.remove(prenumerator);
    }

    @Override
    public void wyslijNowyNumer() {
        for (IObserwatorOdbiorca odbiorca : _odbiorcy) {
            odbiorca.odbierzGazete(_numer);

        }
    }

    public void wydajNumer(String numer) {
        _numer = numer;
        wyslijNowyNumer();
    }
}
