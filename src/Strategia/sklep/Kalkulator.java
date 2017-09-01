package Strategia.sklep;

import java.util.List;

public class Kalkulator {
    private List<IProdukt> _produktList;
    private IPodatek _podatek;

    public Kalkulator(List<IProdukt> produktList, IPodatek podatek){
        _produktList = produktList;
        _podatek = podatek;
        }
    public double calculateBruttoValueForAllProducts(){
        double bruttoPrice = 0.0;
        for (IProdukt produkt : _produktList) {

            bruttoPrice += _podatek.oblicPodatek(produkt.getNettoPrice());
        }
        return bruttoPrice;
    }
    public void showBasketWithProductsNettoAndBrutto(){
        System.out.println(_podatek.getCountryCode());
        for (IProdukt produkt : _produktList) {
            System.out.printf("%s :: %.2f :: %.2f\n", produkt.getName(), produkt.getNettoPrice(),
                    _podatek.oblicPodatek(produkt.getNettoPrice()));

        }

    }





    public void setPodatek(IPodatek podatek){
        _podatek = podatek;
    }


}

