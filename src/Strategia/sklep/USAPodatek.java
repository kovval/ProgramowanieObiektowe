package Strategia.sklep;

public class USAPodatek implements IPodatek {
    @Override
    public double oblicPodatek(double price) {
        return price + price *0.54;
    }

    @Override
    public String getCountryCode() {
        return "En";
    }
}
