package Strategia.sklep;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<IProdukt> produkts = new ArrayList<>();
        produkts.add(new Book());
        produkts.add(new PlytaCD());
        produkts.add(new LekiZApteki());


        IPodatek plTax = new PolskiTax();
        IPodatek usTax = new USAPodatek();
        IPodatek deTAx = new dePodatek();

        Kalkulator kal = new Kalkulator(produkts, plTax);

//        kal.showBasketWithProductsNettoAndBrutto();
        kal.setPodatek(plTax);
        kal.showBasketWithProductsNettoAndBrutto();
        kal.setPodatek(usTax);
        kal.showBasketWithProductsNettoAndBrutto();
        kal.setPodatek(deTAx);
        kal.showBasketWithProductsNettoAndBrutto();

//        kal.calculateBruttoValueForAllProducts();


    }
}
