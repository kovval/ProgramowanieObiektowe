package Strategia.sklep;

public class PolskiTax implements IPodatek {
    @Override
    public double oblicPodatek(double price) {
        return price + price *0.23;
    }

    @Override
    public String getCountryCode() {
        return "pl";
    }
}
