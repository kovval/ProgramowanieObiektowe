package ObserwatorWzorzec.Gazeta;

/**
 * Created by RENT on 2017-08-30.
 */
public class JanK implements IObserwatorOdbiorca {
    private IWadawcaPodmiot _gazeta;

    public JanK(IWadawcaPodmiot gazeta){
       zaprenumerujGazete(gazeta);
    }

    @Override
    public void odbierzGazete(String numer) {
        System.out.printf("Kolejny numer, tym tazem numer %s, który kupił bym gdyby nie te szlugi\n", numer);
    }
    public void rezygnujZGazety(){
        _gazeta.usunOdbiorcaObserwator(JanK.this);
    }
    public void zaprenumerujGazete(IWadawcaPodmiot gazeta){
        _gazeta = gazeta;
        _gazeta.dodajOdbiorcaObserwator(JanK.this);
    }

}
