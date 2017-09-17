package ENUM.TasowanieTalli;

public class Karta {
    private Figury _figura;
    private Kolor _kolor;

    public Figury getFigura() {
        return _figura;
    }

    public Kolor geKolor() {
        return _kolor;
    }

    @Override
    public String toString() {
        return "("+_figura + " "+ _kolor+") ";
    }

    public Karta(Figury figura, Kolor kolor) {
        _figura = figura;
        _kolor = kolor;

    }


}
