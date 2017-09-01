package Strategia.sklep;

public class dePodatek implements IPodatek {
    @Override
    public double oblicPodatek(double price) {
        return price + price *0.4;

    }

    @Override
    public String getCountryCode() {
        return "de";
    }
}
