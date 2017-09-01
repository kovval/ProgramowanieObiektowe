package Strategia.sklep;

public class Book implements IProdukt {
    private String _name;
    private double _nettoPrice;

    public Book() {
        _name = "Na Glinianych Nogach";
        _nettoPrice = 31.99;
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public double getNettoPrice() {
        return _nettoPrice;
    }
}
