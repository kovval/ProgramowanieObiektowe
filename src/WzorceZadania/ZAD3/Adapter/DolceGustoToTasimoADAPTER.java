package WzorceZadania.ZAD3.Adapter;

/**
 * Created by RENT on 2017-09-01.
 */
public class DolceGustoToTasimoADAPTER implements ITasimo {
    private IDolceGusto _idolcegusto;

    public DolceGustoToTasimoADAPTER(IDolceGusto idolcegusto) {
        _idolcegusto = idolcegusto;
    }

    @Override
    public void kapsulka() {
        _idolcegusto.kapsula();

    }







}
