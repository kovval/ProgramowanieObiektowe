package ObserwatorWzorzec.Gazeta;

/**
 * Created by RENT on 2017-08-30.
 */
public interface IWadawcaPodmiot {
    void dodajOdbiorcaObserwator(IObserwatorOdbiorca prenumerator);
    void usunOdbiorcaObserwator(IObserwatorOdbiorca prenumerator);
    void wyslijNowyNumer();
}
