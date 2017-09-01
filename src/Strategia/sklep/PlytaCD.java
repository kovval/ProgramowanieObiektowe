package Strategia.sklep;

public class PlytaCD implements IProdukt{
    private String _name;
    private double _price;

    public PlytaCD() {
        _name = "Trzeba było zostać dresiarzem";
        _price = 29.99;
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public double getNettoPrice() {
        return _price;
    }
}
