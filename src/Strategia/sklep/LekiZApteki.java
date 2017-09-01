package Strategia.sklep;

public class LekiZApteki implements IProdukt {
    private String _name;
    private double _price;

    public LekiZApteki(){
        _name = "Uniwersalny lek na ból ....";
        _price = 99.99;
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
