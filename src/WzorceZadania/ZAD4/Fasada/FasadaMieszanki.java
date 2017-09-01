package WzorceZadania.ZAD4.Fasada;

/**
 * Created by RENT on 2017-09-01.
 */
public class FasadaMieszanki {
    private CukierPuder _cukierpuder;
    private Talk _talk;
    private toNum303419 _to303;

    public FasadaMieszanki(CukierPuder cukierpuder, Talk talk, toNum303419 to303) {
        _cukierpuder = cukierpuder;
        _talk = talk;
        _to303 = to303;
    }


    public void zrobMieszanke(){
        _cukierpuder.dodaj();
        _cukierpuder.dodaj();
        _to303.dodaj();
        _cukierpuder.dodaj();
        _talk.dodaj();
    }

    public void zrobCapsa(){
        _talk.dodaj();
        _to303.dodaj();
        _talk.dodaj();
        _cukierpuder.dodaj();
    }


}
