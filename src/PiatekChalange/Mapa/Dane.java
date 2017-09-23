package PiatekChalange.Mapa;

public class Dane {

    private String[][] _dane = {{"wisior", "długi" },{"trampolina", "szeroka"},{"obiekt", "null"},{null, null },{"test", null}, {null, "proba"}};

    private String[] _imiona = {"pawel", "adam","stefa","rosol","wieslaw","morfeusz","wieslaw","augusty","pawel", };

    public Dane(String[][] dane){
        _dane = dane;
    }

    public String[][] get_dane() {
        return _dane;
    }

    public void set_dane(String[][] _dane) {
        this._dane = _dane;
    }

    public String[] get_imiona() {
        return _imiona;
    }

    public void set_imiona(String[] _imiona) {
        this._imiona = _imiona;
    }

    public Dane(String[] imiona){
        _imiona = imiona;
    }
}
