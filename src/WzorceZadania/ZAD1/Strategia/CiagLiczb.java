package WzorceZadania.ZAD1.Strategia;

/**
 * Created by RENT on 2017-09-01.
 */
public  final class CiagLiczb {
    private ICiagLiczb _ciag;

    public CiagLiczb(ICiagLiczb ciag) {
        setCiagLiczb(ciag);
    }


    public void setCiagLiczb(ICiagLiczb ciag ){ _ciag = ciag;}
    public int[] doCiag(int[] toCiag) { return _ciag.ciag(toCiag);}


}

